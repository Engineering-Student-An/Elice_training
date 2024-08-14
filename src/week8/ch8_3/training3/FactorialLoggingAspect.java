package week8.ch8_3.training3;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Slf4j
public class FactorialLoggingAspect {

    @Pointcut("execution(* com.elice.factorial.Factorial.*(..))")
    public void factorialMethods() {

    }

    @Before("factorialMethods()")
    public void logBefore(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        log.info("[메서드 호출 전] 호출 클래스: {}", className);
        log.info("[메서드 호출 전] 호출 메서드: {}", methodName);
    }


    @After("factorialMethods()")
    public void logAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        log.info("[메서드 호출 후] 호출 메서드: {}", methodName);
    }
}
