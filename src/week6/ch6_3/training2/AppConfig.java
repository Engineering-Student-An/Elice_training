package week6.ch6_3.training2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week6.ch6_2.training1.UserService;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Configuration
class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
