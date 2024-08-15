package week8.ch8_4.training5;

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException() {
        super("연락처를 찾을 수 없습니다.");
    }
}
