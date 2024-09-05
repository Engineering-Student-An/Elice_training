package week11.ch11_4.training1;

import com.elice.post.domain.Post;
import com.elice.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "home";
    }

    @GetMapping("/search/{keyword}")
    public String getSearchedPosts(@PathVariable(value = "keyword") String keyword, Model model) {
        model.addAttribute("posts", postService.searchPosts(keyword));
        return "home";
    }
}
