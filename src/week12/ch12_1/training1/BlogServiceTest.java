package com.elice.service;

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
    @DisplayName("블로그 글 저장 테스트")
    void saveArticleTest() {


        //given
        AddArticleRequest request = new AddArticleRequest("Test Title", "Test Content");
        Article article = request.toEntity();
        when(blogRepository.save(any(Article.class))).thenReturn(article);

        //when
        Article savedArticle = blogService.save(request);

        //then
        assertNotNull(savedArticle);
        assertEquals("Test Title", savedArticle.getTitle());
        assertEquals("Test Content", savedArticle.getContent());
        verify(blogRepository, times(1)).save(any(Article.class));
    }

}