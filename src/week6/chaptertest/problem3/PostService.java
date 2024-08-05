package week6.chaptertest.problem3;

import org.springframework.stereotype.Service;
import week6.chaptertest.problem2.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    List<Post> data = new ArrayList<>();

    private Long generateId() {
        if (data.isEmpty()) {
            return 1L;
        }

        return data.get(data.size() - 1).getId() + 1;
    }

    // 1. Create
    public Post savePost(PostDTO postDTO) {
        Post post = new Post(postDTO.getTitle(), postDTO.getContent());
        post.setId(generateId());
        data.add(post);
        return post;
    }

    // 2. Read
    // 2-1. 리스트 전체 조회
    public List<Post> getAllPosts() {
        return data;
    }

    // 2-2. id 조건 조회
    public Post getPostById(Long id) {
        return data.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst().orElse(null);
    }

    // 3. Update
    public Post updatePost(Long id, PostDTO postDTO) {
        Post findPost = getPostById(id);
        findPost.setTitle(postDTO.getTitle());
        findPost.setContent(postDTO.getContent());

        return findPost;
    }

    // 4. Delete
    public void deletePost(Long id) {
        for(Post post : data) {
            if(post.getId() == id) {
                data.remove(post);
                break;
            }
        }
    }

}