package week6.ch6_3.training7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// 지시사항에 따라 코드를 작성해 보세요.
@Component
@Primary
public class FactorialWithRecursion implements Factorial {
    @Override
    public void factorial(long n) {
        long result = printFactorialRecursive(n, 1);
        System.out.println("[재귀문] " + n + "의 팩토리얼: " + result);
    }

    private static long printFactorialRecursive(long n, long accumulator) {
        if (n == 0) {
            return accumulator;
        }

        return printFactorialRecursive(n - 1, n * accumulator);
    }
}

