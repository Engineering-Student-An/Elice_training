package week8.ch8_2.training1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class EventRegistrationViewController {

    private final UserInfoValidator userInfoValidator;

    // 지시사항을 참고하여 코드를 작성해 보세요. 
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(userInfoValidator);
    }

    @GetMapping("/v3/event")
    public String getUserInfo(Model model) {
        model.addAttribute("user", new UserInfoForm());
        return "userInfoForm";
    }

    @PostMapping("/v3/event")
    public String getUserInfo(@Validated @ModelAttribute("user") UserInfoForm userInfoForm, BindingResult bindingResult) {
        log.info("user.isMembership={}", userInfoForm.isMembership());

        if (bindingResult.hasErrors()) {
            log.info("errors={}", bindingResult);
            return "userInfoForm";
        }

        return "confirmForm";
    }
}