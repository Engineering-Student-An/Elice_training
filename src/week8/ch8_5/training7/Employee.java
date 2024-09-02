package week8.ch8_5.training7;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
}