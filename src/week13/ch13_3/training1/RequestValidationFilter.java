package week13.ch13_3.training1;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class RequestValidationFilter extends OncePerRequestFilter {


    // 지시사항에 따라 코드를 작성하세요.

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String path = request.getRequestURI();



        // API 호출에 대해서만 Request-Id 헤더를 확인하고, 브라우저 요청에 대해서는 확인하지않음.
        if(path.startsWith("/api/")) {
            String requestId = request.getHeader("Request-Id");
            if(requestId == null || requestId.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Request-ID 헤더가 존재하지 않습니다.");
                return;
            }
        }

        filterChain.doFilter(request, response);
    }
}