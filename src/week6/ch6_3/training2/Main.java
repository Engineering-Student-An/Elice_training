package week6.ch6_3.training2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import week6.ch6_2.training1.UserService;

public class Main {
    public static void main(String[] args) {
        // 지시사항을 참고하여 코드를 작성해 보세요.
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ac.getBean("userService", UserService.class);
        System.out.println(userService.getUserName());
    }
}
