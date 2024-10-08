package week13.chaptertest.problem3;

import io.elice.elcademy.member.entity.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
        .formLogin(auth -> auth
                .loginPage("/login-form")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/subjects")
                .failureUrl("/login-form?error")
        )
        .logout(auth -> auth
                .logoutSuccessUrl("/")
        )
        .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/subjects").permitAll()
                .requestMatchers("/add", "/subjects/add").hasRole("ADMIN")
        )
        .exceptionHandling(exception -> exception
                .accessDeniedHandler(accessDeniedHandler())
        );
        return http.build();
        
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    private AccessDeniedHandler accessDeniedHandler() {
        return (request, response, accessDeniedException) -> {
            response.sendRedirect("/access-denied");
        };
    }
}