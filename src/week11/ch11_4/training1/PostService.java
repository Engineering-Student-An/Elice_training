package week11.ch11_4.training1;

import com.elice.post.domain.Post;
import com.elice.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    // 데이터베이스에 접근하기 위한 객체입니다.
    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
    
    // searchPosts 메서드를 작성합니다.
     public List<Post> searchPosts(String keyword) {
         return postRepository.findByTitleContaining(keyword);
     }
}
