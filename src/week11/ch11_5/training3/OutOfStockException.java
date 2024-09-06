package week11.ch11_5.training3;


/**
 * [지시사항 1]
 * OutOfStockException 클래스 작성
 * 1. ErrorCode OUT_OF_STOCK을 활용
 * 2. RuntimeException 자식 클래스인 RootException을 상속받는다.
 */

import com.elice.common.enums.ErrorCode;
import lombok.Getter;

@Getter
public class OutOfStockException extends RootException {
    private final ErrorCode errorCode;

    public OutOfStockException() {
        super(ErrorCode.OUT_OF_STOCK.getDetailMessage());
        this.errorCode = ErrorCode.OUT_OF_STOCK;
    }
}
