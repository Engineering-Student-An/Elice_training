package week6.ch6_5.training2_3_4_5;

import com.elice.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
