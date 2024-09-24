package week13.ch13_2.training1;

import org.springframework.security.crypto.keygen.BytesKeyGenerator;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.security.crypto.keygen.StringKeyGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Base64;

@RestController
public class KeyGenerationController {

    //지시사항을 참고하여 코드를 작성해 보세요
    @GetMapping("/generate/string")
    public String generateStringKey(@RequestParam(value = "length", defaultValue = "8") int length) {
        String key = KeyGenerators.string().generateKey();
        return key.substring(0, Math.min(key.length(), length));
    }

    @GetMapping("/generate/bytes")
    public String generateBytesKey(@RequestParam(value = "length", defaultValue = "16") int length) {
        byte[] keyBytes = KeyGenerators.shared(length).generateKey();

        return Base64.getEncoder().encodeToString(keyBytes);
    }
}