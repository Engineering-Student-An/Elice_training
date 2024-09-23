package week13.ch13_1.training1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

 
 


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // 지시사항을 참고하여 코드를 작성해 보세요. 
        http.authorizeHttpRequests((auth) -> auth.requestMatchers("/login", "/").permitAll().anyRequest().authenticated());
        
        http.formLogin((auth) -> auth.loginPage("/login").permitAll());
        
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("elice")
                .password("1234")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}