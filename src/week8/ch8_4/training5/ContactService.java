package week8.ch8_4.training5;

import com.elice.entity.Contact;
import com.elice.exception.ContactNotFoundException;
import com.elice.repository.ContactRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Page<Contact> findContacts(int page, int size) {
        return contactRepository.findAll(PageRequest.of(page- 1, size, Sort.by("contactId").descending()));
    }

    public List<Contact> findContacts() {
        return contactRepository.findAll();
    }


    public List<Contact> getContactByNameStartingWith(String name) {
        return contactRepository.findByNameStartingWith(name);
    }

    public List<Contact> getContactByEmailEndingWith(String email) {
        return contactRepository.findByEmailEndingWith(email);
    }

    public Contact findContact(long contactId) {
        return contactRepository.findById(contactId)
                .orElseThrow(() -> new ContactNotFoundException());
    }

    @Transactional
    public Contact createContact(Contact contact) {
        Contact savedContact = contactRepository.save(contact);

        return savedContact;
    }

    public Contact updateContact(Contact contact) {
        Contact findContact = contactRepository.findById(contact.getContactId())
                .orElseThrow(() -> new ContactNotFoundException());

        if (contact.getName() != null) {
            findContact.setName(contact.getName());
        }
        if (contact.getPhoneNumber() != null) {
            findContact.setPhoneNumber(contact.getPhoneNumber());
        }
        if (contact.getEmail() != null) {
            findContact.setEmail(contact.getEmail());
        }

        return contactRepository.save(findContact);
    }

    public void deleteContact(long contactId) {

        Contact contact = contactRepository.findById(contactId)
                .orElseThrow(() -> new ContactNotFoundException());

        contactRepository.delete(contact);
    }
}

