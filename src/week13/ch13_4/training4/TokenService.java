package week13.ch13_4.training4;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    private final String secretKey = "yourSecretKey";

    public String generateToken(String username) {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        return JWT.create()
                // TODO: username을 subject로 설정하세요
                .withSubject(username)
                // TODO: 만료시간을 설정하세요 (1시간)
                .withExpiresAt(new Date(System.currentTimeMillis() + 60 * 60 * 1000))
                // TODO: algorithm으로 서명하세요
                .sign(algorithm);
    }

    public boolean validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretKey);
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(token);
            return true;
        } catch (// TODO: 토큰만료 exception을 감지하세요
        TokenExpiredException ex) {
            // TODO: 토큰만료 시 true를 반환하세요
            return true;
        } catch (JWTVerificationException e) {
            return false; // 토큰 검증 실패
        }
    }
}