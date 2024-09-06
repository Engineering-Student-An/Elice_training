package week11.ch11_5.training3;

import com.elice.common.enums.ErrorCode;
import com.elice.common.exception.OutOfStockException;
import com.elice.common.response.ErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RequiredArgsConstructor
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * [지시사항 2]
     * OutOfStockException 예외에 대한 ExceptionHandler 추가
     */
    @ExceptionHandler(OutOfStockException.class)
    public ErrorResponse exceptionHandler(OutOfStockException e) {
        log.error("Global-Handler[OutOfStockException] - {}", e.getErrorCode().getDetailMessage());

        return new ErrorResponse(e.getErrorCode());
    }
    
}

