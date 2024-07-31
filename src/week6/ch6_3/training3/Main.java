package week6.ch6_3.training3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 지시사항을 참고하여 코드를 작성해 보세요.
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] allBeanNames = ac.getBeanDefinitionNames();

        for(String beanName : allBeanNames) {
            Object bean = ac.getBean(beanName);
            System.out.println("빈 이름: " + beanName + ", 타입: " + bean.getClass().getName());
        }
    }
}
