package week11.ch11_2.training4;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long id;

    private String name;

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @OneToMany(mappedBy = "department")
    private List<Employee> employees = new ArrayList<>();
}