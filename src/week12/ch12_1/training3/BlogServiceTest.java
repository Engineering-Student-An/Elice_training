package week12.ch12_1.training3;

import com.elice.domain.Article;
import com.elice.dto.AddArticleRequest;
import com.elice.dto.UpdateArticleRequest;
import com.elice.repository.BlogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class BlogServiceTest {

    @Mock
    private BlogRepository blogRepository;

    @InjectMocks
    private BlogService blogService;

    @BeforeEach void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @Test
    @DisplayName("ID로 블로그 글 조회 테스트")
    void findArticleByIdTest() {


        //given
        Long articleId = 1L;
        Article article = new Article("Test Title", "Test Content");
        when(blogRepository.findById(articleId)).thenReturn(Optional.of(article));
        
        //when
        Article foundArticle = blogService.findById(articleId);
        
        //then
        assertNotNull(foundArticle);
        assertEquals("Test Title", foundArticle.getTitle());
        assertEquals("Test Content", foundArticle.getContent());
        verify(blogRepository, times(1)).findById(articleId);
    }
    
}