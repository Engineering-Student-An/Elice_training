package week11.ch11_5.training3;

import com.elice.book.domain.Book;
import com.elice.common.enums.ChatCode;
import com.elice.common.enums.ErrorCode;
import com.elice.common.event.AlarmEvent;
import com.elice.common.exception.OutOfStockException;
import com.elice.order.domain.Order;
import com.elice.order.model.OrderRequest;
import com.elice.order.model.OrderResponse;
import com.elice.repository.book.BookRepository;
import com.elice.repository.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    /**
     * [지시사항 4-1]
     * Spring ApplicationContext publisher 의존성 주입
     */
    private final ApplicationEventPublisher eventPublisher;
    private final OrderRepository orderRepository;
    private final BookRepository bookRepository;

    public OrderResponse saveOrder(OrderRequest orderRequest) {

        //재고 조회
        if (!isStockSufficient(orderRequest)) {
            /**
             * [지시사항 4-2]
             * 1. 이벤트 발행
             *   - 파라미터는 AlarmEvent, ChatCode, ErrorCode 참고
             */
            eventPublisher.publishEvent(new AlarmEvent(ChatCode.ORDER_ISSUE.getChatUuid(), ErrorCode.OUT_OF_STOCK));

            /**
             * [지시사항 4-3]
             * 2. OutOfStockException 예외 throw
             */
            throw new OutOfStockException();
        }

        Order order = new Order(orderRequest.getBookCode(), orderRequest.getBookName(), orderRequest.getQuantity());
        orderRepository.save(order);

        return new OrderResponse(order.getUuid(), true);
    }

    private boolean isStockSufficient(OrderRequest orderRequest) {
        Book book = bookRepository.findByBookCode(orderRequest.getBookCode());
        return orderRequest.getQuantity() <= book.getQuantity();
    }

}
