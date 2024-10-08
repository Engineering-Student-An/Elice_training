package week8.ch8_1.training4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactResponseDto {

    private Long contactId;
    private String name;
    private String phoneNumber;
    private String email;

    public ContactResponseDto() {
    }


    public ContactResponseDto(Long contactId, String name, String phoneNumber, String email) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}

