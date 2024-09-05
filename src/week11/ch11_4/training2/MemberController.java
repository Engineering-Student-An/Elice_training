package week11.ch11_4.training2;

import com.elice.post.domain.Member;
import com.elice.post.dto.SignUpDto;
import com.elice.post.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public Member signupMember(@RequestBody SignUpDto signUpDto) {
        return memberService.signUp(signUpDto);
    }

}
