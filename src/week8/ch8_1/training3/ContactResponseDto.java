package week8.ch8_1.training3;

public class ContactResponseDto {

    // 지시사항에 맞게 코드를 작성하세요.
    private Long contactId;
    private String name;
    private String phoneNumber;
    private String email;

    protected ContactResponseDto () { }

    public ContactResponseDto (Long contactId, String name, String phoneNumber, String email) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getContactId() {
        return this.contactId;
    }
    public String getName() {
        return this.name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getEmail() {
        return this.email;
    }
}
