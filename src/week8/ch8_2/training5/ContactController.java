package week8.ch8_2.training5;

import com.elice.entity.Contact;
import com.elice.entity.ContactPostDto;
import com.elice.entity.ContactResponseDto;
import com.elice.service.ContactService;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contacts")
// 지시사항을 참고하여 코드를 작성해 보세요.
@Validated
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @GetMapping("/{contactId}")
    public ResponseEntity<Contact> getContact(@PathVariable("contactId") @Positive(message="경로변수 contactId는 반드시 양수여야 함") long contactId) {
        Contact contact = contactService.findContact(contactId);
        if (contact == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @GetMapping
    public ResponseEntity<List<Contact>> getContacts(@RequestParam(name = "page", defaultValue = "1") @Min(value=1, message="page는 1 이상의 값이어야 함") int page,
                                                     @RequestParam(name = "size",  defaultValue = "10") @Min(value=1, message="size는 1 이상의 값이어야 함") int size) {
        Page<Contact> pageContacts = contactService.findContacts(page, size);
        List<Contact> contacts = pageContacts.getContent();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Total-Element", String.valueOf(pageContacts.getTotalElements()));
        headers.add("Total-Pages", String.valueOf(pageContacts.getTotalPages()));
        headers.add("Current-Page", String.valueOf(pageContacts.getNumber() + 1));
        headers.add("Page-Size", String.valueOf(pageContacts.getSize()));

        if (contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(contacts, headers, HttpStatus.OK);
    }

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @GetMapping("/name-search")
    public List<Contact> getContactByStartingWith(@RequestParam(name = "name") @NotBlank(message="쿼리 스트링 name의 값은 공백이어서는 안됨") String name) {
        return contactService.getContactByNameStartingWith(name);
    }

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @GetMapping("/email-search")
    public List<Contact> getContactByEmailEndingWith(@RequestParam(name = "email") @Email(message="쿼리 스트링 email의 값은 이메일 형식을 따라야 함") String email) {
        return contactService.getContactByEmailEndingWith(email);
    }

    @PostMapping
    public ResponseEntity<ContactResponseDto> postContact(@RequestBody @Validated ContactPostDto contactPostDto) {
        Contact contact = contactPostDto.toEntity();
        Contact newContact = contactService.createContact(contact);

        ContactResponseDto contactResponseDto = newContact.toContactReponseDto();
        return new ResponseEntity<>(contactResponseDto, HttpStatus.CREATED);
    }

    @PutMapping("/{contactId}")
    public ResponseEntity<Contact> updateContact(@PathVariable("contactId") long contactId, @RequestBody Contact contact) {
        contact.setContactId(contactId);
        Contact updatedContact = contactService.updateContact(contact);
        return new ResponseEntity<>(updatedContact, HttpStatus.OK);
    }

    @DeleteMapping("/{contactId}")
    public ResponseEntity<Void> deleteContact(@PathVariable("contactId") long contactId) {
        contactService.deleteContact(contactId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}