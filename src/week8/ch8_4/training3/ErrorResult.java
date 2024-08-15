package week8.ch8_4.training3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResult {

    private List<FieldError> fieldErrors;

    @Getter
    @AllArgsConstructor
    public static class FieldError {
        // 지시사항을 참고하여 코드를 작성해 보세요.
        private String fieldName;
        private String rejectedValue;
        private String message;
    }
}
