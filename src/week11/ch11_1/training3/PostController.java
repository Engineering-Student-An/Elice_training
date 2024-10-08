package week11.ch11_1.training3;

import com.elice.post.domain.Post;
import com.elice.post.dto.PostDTO;
import com.elice.post.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // GET API
    // 게시글 전체를 조회하는 기능
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    // url에서 id 값을 이용하여 게시글 하나를 조회하는 기능
    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable(value = "id") Long id) {
        return postService.getPostById(id);
    }

}
