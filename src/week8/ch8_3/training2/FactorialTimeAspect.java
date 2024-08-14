package week8.ch8_3.training2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FactorialTimeAspect {
    
    // 지시사항에 따라 코드를 작성해 주세요.
    @Pointcut("execution(* com.elice.factorial.Factorial.*(..))")
    public void factorialMethods() {
    }

    @Around("factorialMethods()")
    public void measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime(); // 시작 시간 측정

        Object result = joinPoint.proceed(); // 타깃 메서드 호출

        long endTime = System.nanoTime(); // 종료 시간 측정


        System.out.printf("호출 클래스: %s\n", joinPoint.getTarget().getClass().getSimpleName());
        System.out.printf("실행 시간: %dns\n", (endTime - startTime));
        System.out.println("---------------------------------------");
    }
}