package week6.ch6_3.training6;

import com.elice.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    // 지시 사항에 따라 코드를 작성해 보세요.
    @Bean
    public Counter singletonCounter() {
        return new Counter();
    }

    @Bean
    @Scope("prototype")
    public Counter prototypeCounter() {
        return new Counter();
    }
}
