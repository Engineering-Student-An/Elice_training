package week11.chaptertest.problem2;

import io.elice.elcademy.subject.entity.Subject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 지시사항을 참고하여 코드를 작성해 보세요. 
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Comments")
public class Comment {

    // 지시사항을 참고하여 코드를 작성해 보세요. 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long commentId;

    @Column(nullable=false, unique=true)
    private String commenter;

    @Column(nullable=true, length=140)
    private String contents;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;
}