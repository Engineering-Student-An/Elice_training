package week13.ch13_2.training6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public TextEncryptor textEncryptor() {
        // 지시사항을 참고하여 코드를 작성해보세요
        final String PASSWORD = "ElicePassword";

        String salt = KeyGenerators.string().generateKey();

        TextEncryptor textEncryptor = Encryptors.text(PASSWORD, salt);

        return textEncryptor;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin().disable()
                .httpBasic().disable();

        return http.build();
    }

}