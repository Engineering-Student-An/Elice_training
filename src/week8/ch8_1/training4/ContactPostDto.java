package week8.ch8_1.training4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactPostDto {
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

//    public Contact toEntity() {
//        Contact contact = new Contact(name, phoneNumber, email);
//        return contact;
//    }
}
