package week6.chaptertest.problem2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // Post의 CRUD API를 만들어봅니다.

    // 1. Create
    @PostMapping("/posts")
    public Post createPost(@RequestBody PostDTO postDTO) {
        return postService.savePost(postDTO);
    }

    // 2. Read
    // 2-1. 리스트 전체 조회
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    // 2-2. id 조건 조회
    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }
}