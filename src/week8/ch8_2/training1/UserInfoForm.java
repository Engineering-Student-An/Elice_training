package week8.ch8_2.training1;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoForm {

    private String name;

    private Integer age;

    private boolean membership;
}
