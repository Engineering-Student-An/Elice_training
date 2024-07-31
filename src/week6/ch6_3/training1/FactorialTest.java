package week6.ch6_3.training1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactorialTest {
    public static void main(String[] args) {

        // 지시사항에 따라 코드를 작성해 보세요.
       AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactorialConfig.class);

        ac.getBean("factorialTimeAspect");
        ac.getBean("factorialLoggingAspect");
        ac.getBean("factorial");
    }
}