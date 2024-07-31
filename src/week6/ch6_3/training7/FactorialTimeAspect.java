package week6.ch6_3.training7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 지시사항에 따라 코드를 작성해 보세요.
@Aspect
@Component
public class FactorialTimeAspect {
    @Pointcut("execution(public void com.elice.factorial..factorial(..))")
    private void targetMethod() {};


    @Around("targetMethod()")
    public Object calculateTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        try {
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long endTime = System.nanoTime();
            System.out.printf("호출 클래스: %s\n", joinPoint.getTarget().getClass().getSimpleName());
            System.out.printf("실행 시간: %d ns\n", (endTime - startTime));
        }
    }
}