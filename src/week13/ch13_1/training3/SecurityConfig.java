package week13.ch13_1.training3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;



// 지시사항을 참고하여 코드를 작성해 보세요.   
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    
    // 지시사항을 참고하여 코드를 작성해 보세요.   
        http.csrf().disable()
        .authorizeRequests().anyRequest().permitAll().and()
        .formLogin().disable()
        .httpBasic().disable();


        return http.build();
    }
}
