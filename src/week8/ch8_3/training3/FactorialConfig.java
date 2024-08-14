package week8.ch8_3.training3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class FactorialConfig {

    @Bean
    public FactorialTimeAspect factorialTimeAspect() {
        return new FactorialTimeAspect();
    }
    
    // 지시사항에 따라 코드를 작성해 보세요.
    @Bean
    public FactorialLoggingAspect factorialLoggingAspect() {
        return new FactorialLoggingAspect();
    }
    
    @Bean
    public Factorial factorial() {
        return new FactorialWithRecursion();
    }
}