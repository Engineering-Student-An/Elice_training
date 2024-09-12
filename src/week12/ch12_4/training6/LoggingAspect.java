package week12.ch12_4.training6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


// 지시사항을 참고하여 코드를 작성해 보세요.
@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    
    @Around("execution(* com.elice.service..*(..))")
    public Object logServiceMethods(ProceedingJoinPoint joinPoint) throws Throwable {
      
        String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        long startTime = System.currentTimeMillis();
        logger.info("-----------------------------------------------------");
        logger.info("메소드 접근 : {} in class: {}", methodName, className);

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        logger.info("메소드 탈출: {} in class: {}. Execution time: {} ms", methodName, className, (endTime-startTime));
        logger.info("-----------------------------------------------------");

        return result;
    }
}