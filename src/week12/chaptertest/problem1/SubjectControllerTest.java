package week12.chaptertest.problem1;

import io.elice.elcademy.subject.entity.Subject;
import io.elice.elcademy.subject.mapper.SubjectMapper;
import io.elice.elcademy.subject.service.SubjectService;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SubjectController.class)
public class SubjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubjectService subjectService;

    @MockBean
    private SubjectMapper subjectMapper;

    //지시사항에 따라 테스트코드를 작성하세요.

    @Test
    public void getSubject_ShouldReturnSubject() throws Exception {
        Subject mockSubject = new Subject();
        mockSubject.setSubjectId(1L);
        mockSubject.setName("Test Subject");
        given(subjectService.findSubject(1L)).willReturn(mockSubject);

        mockMvc.perform(get("/subjects/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.subjectId").value(1))
                .andExpect(jsonPath("$.name").value("Test Subject"));
    }

    @Test
    public void getSubjects_ShouldReturnSubjectsList() throws Exception {
        List<Subject> subjects = Arrays.asList(
                new Subject("Subject 1", 1000),
                new Subject("Subject 2", 1500)
        );
        given(subjectService.findSubjects()).willReturn(subjects);

        mockMvc.perform(get("/subjects"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name").value("Subject 1"))
                .andExpect(jsonPath("$[1].name").value("Subject 2"));
    }
}