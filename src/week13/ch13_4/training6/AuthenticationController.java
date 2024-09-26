package week13.ch13_4.training6;

import com.elice.service.TokenService;
import lombok.*;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTVerificationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        //지시사항을 참고하여 코드를 작성해 보세요.
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        try {
            if(!tokenService.authenticateUser(username, password)) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }

            String token = tokenService.generateToken(username);
            return ResponseEntity.ok(new TokenResponse(token));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during login: " + e.getMessage());
        }

    }

    @GetMapping("/protected")
    public ResponseEntity<?> accessProtectedResource(@RequestHeader("Authorization") String token) {
        try {
            if (tokenService.validateToken(token)) {
                String username = tokenService.getUsernameFromToken(token);
                return ResponseEntity.ok("Access granted to protected resource for user: " + username);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
            }
        } catch (JWTVerificationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token verification failed: " + e.getMessage());
        }
    }


    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    public static class LoginRequest {
        private String username;
        private String password;
    }

    @Getter
    @NoArgsConstructor
    public static class TokenResponse {
        private String token;

        public TokenResponse(String token) {
            this.token = token;
        }
    }
}