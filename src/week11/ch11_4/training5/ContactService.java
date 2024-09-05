package week11.ch11_4.training5;

import com.elice.repository.ContactRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import com.elice.entity.Contact;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // 지시사항에 따라 코드를 작성해 보세요. 
    public Page<Contact> findContacts(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size, Sort.by("contactId").descending());
        return contactRepository.findAll(pageRequest);
    }
}