package week8.ch8_1.training2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentController {
    
    // 지시사항에 따라 코드를 작성해 보세요.
    private final StudentService studentService;

    @GetMapping("/students")
    public String findAll(Model model) {
    
        model.addAttribute("students", studentService.findAll());
        return "students";
    }
}
