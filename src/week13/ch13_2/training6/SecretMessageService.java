package week13.ch13_2.training6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Service;

@Service
public class SecretMessageService {
    private final TextEncryptor textEncryptor;

    @Autowired
    public SecretMessageService(TextEncryptor textEncryptor) {
        this.textEncryptor = textEncryptor;
    }

    public String encryptMessage(String message) {
        return textEncryptor.encrypt(message);
    }

    public String decryptMessage(String encryptedMessage) {
        return textEncryptor.decrypt(encryptedMessage);
    }
}