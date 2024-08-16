package week8.ch8_5.training5;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
	
    // 지시사항을 참고하여 코드를 작성해 보세요. 
    @OneToOne
    @JoinColumn(name="id")
    private UserProfile userProfile;
}