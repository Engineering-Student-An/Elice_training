package week11.ch11_4.training4;

import com.elice.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAll();

    Optional<Post> findById(Long id);

    List<Post> findByTitleContainingOrContentContaining(String title, String content);

    Post save(Post post);

    void delete(Post post);
    
    // TODO : @Query를 사용하여 title에 해당하는 데이터 반환
    @Query("select p from Post p where p.title = ?1")
    List<Post> findByTitleParam(String title);

}