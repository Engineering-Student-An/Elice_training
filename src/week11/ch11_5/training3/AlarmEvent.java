package week11.ch11_5.training3;

//POJO Class
public class AlarmEvent {

    private String chatUuid;
    private Object source;

    public AlarmEvent(String chatUuid, Object source) {
        this.chatUuid = chatUuid;
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public String getChatUuid() {
        return chatUuid;
    }
}
