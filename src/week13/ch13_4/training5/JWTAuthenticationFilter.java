package week13.ch13_4.training5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.elice.member.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@RequiredArgsConstructor
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    private static Logger log = LoggerFactory.getLogger(JWTAuthenticationFilter.class);


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        log.info("메서드 시작");
        // 지시사항을 참고하여 코드를 작성해 보세요.
        try {

            Member member = new ObjectMapper().readValue(request.getInputStream(), Member.class);
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(member.getName(), member.getPassword());
            log.info("인증 완료");
            return authenticationManager.authenticate(token);
        } catch(IOException e) {
            e.printStackTrace();
        }
        

        return null;
    }

}