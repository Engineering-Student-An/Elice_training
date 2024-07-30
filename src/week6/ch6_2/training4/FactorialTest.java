package week6.ch6_2.training4;

public class FactorialTest {
    public static void main(String[] args) {

        // 지시사항을 참고하여 코드를 작성해 보세요.
        FactorialProxy factorialProxy = new FactorialProxy(new FactorialWithFor());
        factorialProxy.factorial(20);

        FactorialProxy factorialProxy2 = new FactorialProxy(new FactorialWithRecursion());
        factorialProxy2.factorial(20);
    }
}
