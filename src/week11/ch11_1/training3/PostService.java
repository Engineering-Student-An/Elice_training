package week11.ch11_1.training3;

import com.elice.post.domain.Post;
import com.elice.post.dto.PostDTO;
import com.elice.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 2-1 전체 리스트 조회 서비스
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // 2-2 id 기반 조회 서비스
    public Post getPostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return post;
    }

}
