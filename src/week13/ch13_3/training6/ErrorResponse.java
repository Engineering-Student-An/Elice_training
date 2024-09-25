package week13.ch13_3.training6;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
@Setter
@Getter
@Builder
public class ErrorResponse {
    private int errorCode;
    private String errorMessage;

}