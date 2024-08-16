package week8.ch8_5.training1;

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

	// 지시사항을 따라 데이터를 조회할 수 있는 두 개의 메서드를 구현해 보세요.
    public List<Contact> findAll() {
        String sql = "SELECT * FROM contact";
        return jdbcTemplate.query(sql, contactRowMapper());
    }

    public Optional<Contact> findById(long id) {
        String sql = "SELECT * FROM contact WHERE contact_id = ?";
        try {
            Contact contact = jdbcTemplate.queryForObject(sql, contactRowMapper(), id);
            return Optional.ofNullable(contact);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

}