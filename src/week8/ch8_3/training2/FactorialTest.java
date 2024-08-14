package week8.ch8_3.training2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactorialTest {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactorialConfig.class);
        Factorial factorial = applicationContext.getBean("factorial", Factorial.class);
        factorial.factorial(20);

        applicationContext.close();
    }
}
