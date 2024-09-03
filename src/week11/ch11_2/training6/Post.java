package week11.ch11_2.training6;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="POST_ID")
    private Long id;

    private String title;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
