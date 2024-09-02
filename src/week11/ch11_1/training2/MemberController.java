package week11.ch11_1.training2;

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

    @PutMapping("/member/{id}/change/{nickname}")
    public Member changeNickname(@RequestParam(name = "id") Long id, @RequestParam(name = "nickname") String nickname) {
        return memberService.updateNickname(id, nickname);
    }
}
