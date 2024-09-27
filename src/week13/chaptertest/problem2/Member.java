package week13.chaptertest.problem2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;
    private String email;
    private String password;

    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Role{
        USER("ROLE_USER", "일반 회원"),
        ADMIN("ROLE_ADMIN", "관리자");

        private final String key;
        private final String title;
    }
}
