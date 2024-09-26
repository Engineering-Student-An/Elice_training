package week13.ch13_4.training6;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {
    
    // 지시사항을 참고하여 코드를 작성해 보세요.
    // final 글로벌 변수선언
    private final String secretKey = "eliceSecretKey";
    private final long expirationTime = 3600000;
    

    public String generateToken(String username) {
        // 지시사항을 참고하여 코드를 작성해 보세요.
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        String token = JWT.create().withSubject(username).withIssuedAt(new Date()).withExpiresAt(new Date(System.currentTimeMillis() + expirationTime)).sign(algorithm);
        return token;
    }

    public boolean validateToken(String token) throws JWTVerificationException {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT jwt = verifier.verify(token);
        return !jwt.getExpiresAt().before(new Date());
    }

    public String getUsernameFromToken(String token) throws JWTVerificationException {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT jwt = verifier.verify(token);
        return jwt.getSubject();
    }

    // 실제 애플리케이션에서는 이 메서드를 데이터베이스나 다른 인증 시스템과 연동해야 합니다.
    public boolean authenticateUser(String username, String password) {
        // 예시 목적으로 간단한 검증만 수행합니다.
        return "admin".equals(username) && "password".equals(password);
    }
}