package week6.ch6_5.training2_3_4_5.controller;

import com.elice.entity.Contact;
import com.elice.service.ContactService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

	// 실습2. 지시사항에 따라 코드를 작성해 보세요.
    @GetMapping("/{contactId}")
    public ResponseEntity<Contact> getOne(@PathVariable("contactId") Long contactId) {
        Contact contact = contactService.findContact(contactId);
        if(contact == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(contact);
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAll() {
        List<Contact> contacts = contactService.findContacts();
        if(contacts == null || contacts.size() == 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(contacts);
    }
    // ================================================================================== //
    // 실습3. 지시사항에 따라 코드를 작성해 보세요.
    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact createContact = contactService.createContact(contact);
        if(createContact == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(createContact);
    }
    // ================================================================================== //
    // 실습4. 지시사항에 따라 코드를 작성해 보세요.
    @PutMapping("/{contactId}")
    public ResponseEntity<Contact> putContact(@RequestBody Contact contact, @PathVariable Long contactId) {
        contact.setContactId(contactId);
        Contact updateContact = contactService.updateContact(contact);

        return ResponseEntity.ok(updateContact);
    }
    // ================================================================================== //
    // 실습5. 지시사항에 따라 코드를 작성해 보세요.
    @DeleteMapping("/{contactId}")
    public ResponseEntity deleteContact(@PathVariable Long contactId) {
        contactService.deleteContact(contactId);
        return ResponseEntity.noContent().build();
    }
    // ================================================================================== //
}