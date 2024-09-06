package week11.ch11_5.training2;


import com.elice.socket.model.MessageModel;
import com.elice.socket.model.OutputMessageModel;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Controller
public class WebSocketController {

    //[지시사항 2-1]
    @MessageMapping("/message/send/{chatUuid}")
    //[지시사항 2-2]
    @SendTo("/topic/chat/{chatUuid}")
    public OutputMessageModel sendMessage(@Payload MessageModel messageModel, @DestinationVariable String chatUuid) {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessageModel(messageModel.getSender(), messageModel.getChatUuid(),
                messageModel.getContent(), time, OutputMessageModel.MessageType.CHAT);
    }
}