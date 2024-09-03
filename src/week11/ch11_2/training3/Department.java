package week11.ch11_2.training3;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "department_id")
   private Long id;

   private String name;

}