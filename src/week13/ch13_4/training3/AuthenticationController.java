package week13.ch13_4.training3;

import com.elice.practice.service.TokenService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        // TODO: 토큰을 생성하세요
        String token = tokenService.generateToken(username);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/protected")
    public ResponseEntity<?> accessProtectedResource(@RequestHeader("Authorization") String token) {
        // TODO: 토큰을 검증하여 isValidToken(Boolean)에 할당하세요
        boolean isValidToken = tokenService.validateToken(token);
        if (isValidToken) {
            return ResponseEntity.ok("Access to protected resource granted");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
        }
    }


    @Getter
    @NoArgsConstructor
    public static class LoginRequest {
        private String username;
    }
}