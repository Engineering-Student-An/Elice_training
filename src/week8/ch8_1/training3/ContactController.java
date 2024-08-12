package week8.ch8_1.training3;

import com.elice.entity.Contact;
import com.elice.entity.ContactPostDto;
import com.elice.entity.ContactResponseDto;
import com.elice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // 지시사항에 맞게 코드를 수정해 주세요.
    @PostMapping
    public ResponseEntity<ContactResponseDto> postContact(@RequestBody ContactPostDto contactPostDto) {
        Contact contact = contactPostDto.toContact();
        Contact newContact = contactService.createContact(contact);
        return new ResponseEntity<>(newContact.toContactReponseDto(), HttpStatus.CREATED);
    }
    
}