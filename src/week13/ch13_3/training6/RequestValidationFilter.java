package week13.ch13_3.training6;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.elice.error.ErrorResponse;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class RequestValidationFilter extends OncePerRequestFilter {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String path = request.getRequestURI();


        // 지시사항을 참고하여 아래 코드를 개선하세요.
        if (path.startsWith("/api/")) {
            String requestId = request.getHeader("Request-Id");
            if (requestId == null || requestId.isBlank()) {
                response.setContentType("application/json");
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

                ErrorResponse error = new ErrorResponse(400001, "Request-Id header is missing or empty");
                String jsonResponse = objectMapper.writeValueAsString(error);

                response.getWriter().write(jsonResponse);
                return;
            }
        }

        filterChain.doFilter(request, response);
    }
}