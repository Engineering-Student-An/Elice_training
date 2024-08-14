package week8.ch8_3.training2;

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

    @Bean
    public Factorial factorial() {
        return new FactorialWithRecursion();
    }
}