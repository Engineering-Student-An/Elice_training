package week8.ch8_5.training3;

import com.elice.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcContactRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcContactRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    private RowMapper<Contact> contactRowMapper() {
        return (rs, rowNum) -> {
            Contact contact = new Contact();
            contact.setContactId(rs.getLong("contact_id"));
            contact.setName(rs.getString("name"));
            contact.setPhoneNumber(rs.getString("phone_number"));
            contact.setEmail(rs.getString("email"));
            return contact;
        };
    }
    
    public Optional<Contact> findById(long id) {
        try {
            Contact contact = jdbcTemplate.queryForObject(
                    "SELECT * FROM contact WHERE contact_id = ?",
                    contactRowMapper(),
                    id
            );
            return Optional.ofNullable(contact);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

	// 지시사항을 따라 코드를 작성해 보세요.
    public void delete(Contact contact) {
        String sql = "DELETE FROM contact WHERE contact_id = ?";
        jdbcTemplate.update(sql, contact.getContactId());
    }
}