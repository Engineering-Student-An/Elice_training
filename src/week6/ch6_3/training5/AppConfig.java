package week6.ch6_3.training5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}