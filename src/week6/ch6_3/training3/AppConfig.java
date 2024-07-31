package week6.ch6_3.training3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week6.ch6_2.training1.UserService;
import week6.ch6_2.training2.OrderService;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Configuration
class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }

}