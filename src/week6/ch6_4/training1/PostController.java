package week6.ch6_4.training1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/")
    public String home(Model model) {
        // Model로 전달되는 값을 변경해서 확인해보세요.
        model.addAttribute("posts", "안창민");
        return "home";
    }

    @GetMapping("/home2")
    @ResponseBody
    public String rest() {
        return "home";
    }

}
