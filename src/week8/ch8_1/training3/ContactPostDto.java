package week8.ch8_1.training3;

public class ContactPostDto {

    // 지시사항에 맞게 코드를 작성하세요.
    private String name;
    private String phoneNumber;
    private String email;

    public ContactPostDto() {
    }

    public ContactPostDto(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact toContact() {
        Contact contact = new Contact(name, phoneNumber, email);
        return contact;
    }
}

