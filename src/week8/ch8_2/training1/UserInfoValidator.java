package week8.ch8_2.training1;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Component
public class UserInfoValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return UserInfoForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UserInfoForm userInfo = (UserInfoForm) target;

        // 지시사항을 참고하여 코드를 작성해 보세요.
        String name = userInfo.getName();
        if(name == null || name.isEmpty()) {
            errors.rejectValue("name", "required", "(이름) 잘못된 입력입니다.");
        }
        if(userInfo.getAge() < 19) {
            errors.rejectValue("age", "min", "(최소 나이 조건) 잘못된 입력입니다.");
        }
        if(!userInfo.isMembership()) {
            errors.rejectValue("membership", "membership", "(멤버십) 잘못된 입력입니다.");
        }
    }
}