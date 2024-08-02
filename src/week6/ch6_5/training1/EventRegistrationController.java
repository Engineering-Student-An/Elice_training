package week6.ch6_5.training1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventRegistrationController {

    // 지시 사항에 따라 코드를 작성해 보세요.
    @PostMapping("/event")
    public String event(@RequestParam("name") String name,
                        @RequestParam("age") int age) {
        
        return "감사합니다 " + name + "님(" + age + "), 이벤트 참가 신청이 완료되었습니다!";
    }
}

