package week13.ch13_4.training4;

import com.elice.practice.service.TokenService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.auth0.jwt.JWT;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final TokenService tokenService;

    @PostMapping("/refreshToken")
    public ResponseEntity<?> refreshToken(@RequestHeader("Authorization") String token) {
        String username = JWT.decode(token).getSubject();

        // TODO: 토큰을 검증하고, 검증 성공 시 토큰을 재발급하세요
        if(tokenService.validateToken(token)) {
            String newToken = tokenService.generateToken(username);
            return ResponseEntity.ok(newToken);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
    }
}