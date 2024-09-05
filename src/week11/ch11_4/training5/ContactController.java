package week11.ch11_4.training5;

import com.elice.entity.Contact;
import com.elice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
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


    // 지시사항에 따라 코드를 작성해 보세요. 
    @GetMapping
    public ResponseEntity<Page<Contact>> getContacts(@RequestParam(name = "page", defaultValue = "1") int page, 
                                                    @RequestParam(name = "size", defaultValue = "1") int size) {
        
        Page<Contact> contacts = contactService.findContacts(page, size);

        if(contacts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Total-Element", String.valueOf(contacts.getTotalElements()));
        httpHeaders.add("Total-Pages", String.valueOf(contacts.getTotalPages()));
        httpHeaders.add("Current-Page", String.valueOf(contacts.getNumber() + 1));
        httpHeaders.add("Page-Size", String.valueOf(contacts.getSize()));

        return ResponseEntity.status(HttpStatus.OK)
                             .headers(httpHeaders)
                             .body(contacts);
    }                                                       
}