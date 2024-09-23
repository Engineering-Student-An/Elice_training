package week13.ch13_1.training2;

import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Duration;
import java.time.Instant;


@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "redirect:/check-login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/check-login")
    public String checkLogin(Model model, HttpSession session) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        boolean isLoggedIn = auth != null && auth.isAuthenticated() && !"anonymousUser".equals(auth.getPrincipal());

        if (isLoggedIn) {
            model.addAttribute("isLoggedIn", true);
            model.addAttribute("username", auth.getName());

            Instant now = Instant.now();
            Instant expires = Instant.ofEpochMilli(session.getLastAccessedTime() + session.getMaxInactiveInterval() * 1000L);
            Duration remaining = Duration.between(now, expires);

            long remainingSeconds = remaining.getSeconds();
            model.addAttribute("remainingSeconds", remainingSeconds);
        } else {
            model.addAttribute("isLoggedIn", false);
        }

        return "check-login";
    }
}