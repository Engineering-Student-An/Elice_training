package week13.ch13_4.training5;

import com.elice.member.Member;
import com.elice.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class Controller {

    private final MemberService memberService;

    @GetMapping("/home")
    public String home() {
        return "홈 화면";
    }

    @PostMapping("/join")
    public String join(@RequestBody Member member) {
        memberService.createMember(member);
        return "회원가입 완료";
    }

    @GetMapping("/admin")
    public String admin() {
        return "어드민만 접근 가능한 페이지";
    }

    @GetMapping("/user")
    public String users() {
        return "일반 유저가 접근 가능한 페이지";
    }

}
