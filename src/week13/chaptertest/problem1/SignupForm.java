package week13.chaptertest.problem1;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SignupForm {

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    @NotEmpty
    private String name;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
