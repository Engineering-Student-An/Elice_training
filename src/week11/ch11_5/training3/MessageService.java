package week11.ch11_5.training3;

import com.elice.socket.model.MessageModel;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MessageService {

    private final SimpMessagingTemplate messagingTemplate;
    private final MessageChatService messageChatService;

    @Transactional
    public void sendMessage(String destination, MessageModel messageModel) {
        try {
            //[지시사항 6]
            messagingTemplate.convertAndSend(destination, messageModel);
        } catch (MessagingException me) {
            throw new MessagingException("ab");
        }

        messageChatService.save(messageModel);

    }
}
