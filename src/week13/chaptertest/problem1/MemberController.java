package week13.chaptertest.problem1;

import com.elice.form.SignupForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @PostMapping("/members/signup")
    public String signup(@Validated @ModelAttribute SignupForm signupForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "member-register";
        }

        Member member = new Member(signupForm.getName(), signupForm.getEmail(), signupForm.getPassword());
        memberRepository.save(member);

        return "redirect:/";
    }
}
