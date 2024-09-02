package week11.ch11_1.training3;

import com.elice.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // 전체 리스트 조회
    List<Post> findAll();

    // id 조건 조회
    Optional<Post> findById(Long id);
}
