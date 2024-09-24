package week13.ch13_2.training6;

import com.elice.dto.DecryptedMessageResponse;
import com.elice.dto.EncryptedMessageRequest;
import com.elice.dto.EncryptedMessageResponse;
import com.elice.dto.MessageRequest;
import com.elice.service.SecretMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SecretMessageController {
    private final SecretMessageService secretMessageService;

    @Autowired
    public SecretMessageController(SecretMessageService secretMessageService) {
        this.secretMessageService = secretMessageService;
    }

    @PostMapping("/encrypt")
    public EncryptedMessageResponse encrypt(@RequestBody MessageRequest request) {

        String encryptedMessage = secretMessageService.encryptMessage(request.getMessage());
        return new EncryptedMessageResponse(encryptedMessage);
    }

    @PostMapping("/decrypt")
    public DecryptedMessageResponse decrypt(@RequestBody EncryptedMessageRequest request) {
        String decryptedMessage = secretMessageService.decryptMessage(request.getEncryptedMessage());
        return new DecryptedMessageResponse(decryptedMessage);
    }
}