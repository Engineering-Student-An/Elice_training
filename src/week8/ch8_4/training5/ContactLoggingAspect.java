package week8.ch8_4.training5;

import com.elice.exception.ContactNotFoundException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// 지시사항을 참고하여 코드를 작성해 보세요.
@Aspect
@Component
public class ContactLoggingAspect {

    // 테스트를 위한 코드입니다. 수정하지 말아주세요.
    private Logger log = LoggerFactory.getLogger(ContactLoggingAspect.class);

    public void setLogger(Logger logger) {
        this.log = logger;
    }
    // 여기까지

    // 지시사항을 참고하여 코드를 작성해 보세요.
    @Pointcut("execution(* com.elice.service.ContactService.*(..))")
    private void targetMethod(){}

    @AfterThrowing(pointcut = "targetMethod()", throwing="ex")
    public void logAfterThrowing(JoinPoint joinPoint, ContactNotFoundException ex) {
        log.error("[예외 발생] 메서드: {}, 에러 메시지: {}", joinPoint.getSignature().toShortString(), ex.getMessage());
    }
}