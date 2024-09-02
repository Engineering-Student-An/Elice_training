package week11.ch11_1.training5;

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

    // PUT APIs
    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody PostDTO postDTO) {
        postDTO.setId(id);
        return postService.updatePost(postDTO);
    }


    // DELETE APIs
    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable(value = "id") Long id) {
        postService.deletePost(id);
    }
}
