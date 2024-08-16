package week8.ch8_5.training6;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long departmentId;

   private String name;

}