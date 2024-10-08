package week8.ch8_4.training4;

import com.elice.exception.ErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.stream.Collectors;

import java.util.List;
import java.util.stream.Stream;

// 지시사항을 참고하여 코드를 작성해 보세요.
@RestControllerAdvice
public class GlobalExceptionAdvice {

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @ExceptionHandler
    public ResponseEntity exceptionHandle(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();

        List<ErrorResult.FieldError> errorLogs
                = fieldErrors.stream()
                .map(error -> new ErrorResult.FieldError(
                        error.getField(),
                        error.getRejectedValue(),
                        error.getDefaultMessage()
                ))
                .collect(Collectors.toList());

        return new ResponseEntity<>(errorLogs, HttpStatus.BAD_REQUEST);
    }

}