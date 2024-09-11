package week12.ch12_2.training4;

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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

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
    @DisplayName("블로그 글 삭제 테스트")
    void deleteArticleTest() {


        //given
        Long articleId = 1L;
        
        //when
        blogService.delete(articleId);
        
        //then
        verify(blogRepository, times(1)).deleteById(articleId);
    }
    
}