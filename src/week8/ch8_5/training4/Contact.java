package week8.ch8_5.training4;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Entity
@Table(name="Contacts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {
    // 지시사항을 참고하여 코드를 작성해 보세요.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    @Column(name="name", nullable = false, unique = true)
    private String name;

    @Column(name="phoneNumber", nullable = false, updatable = true)
    private String phoneNumber;

    @Column(name="email", nullable = true, updatable = false)
    private String email;
}