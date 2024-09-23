package week13.ch13_1.training3;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SecurityConfigTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("모든 요청이 인증 없이 허용되는지 확인")
    public void testSecurityConfig() throws Exception {
        // given
        String[] endpoints = {"/", "/blog", "/about", "/contact"};

        // then
        for (String endpoint : endpoints) {
            mockMvc.perform(get(endpoint))
                   .andExpect(status().isOk());
        }
    }
}