package week6.ch6_2.training4;

public class FactorialProxy implements Factorial{

    private final Factorial delegator;

    // 지시사항을 참고하여 코드를 작성해 보세요.

    public FactorialProxy (Factorial delegator) {
        this.delegator = delegator;
    }

    // public void setDelegator(Factorial delegator) {
    //     this.delegator = delegator;
    // }

    @Override
    public void factorial(long n) {
        long startTime = System.nanoTime();
        delegator.factorial(n);
        long endTime = System.nanoTime();
        System.out.printf("호출 클래스: %s\n", delegator.getClass().getSimpleName());
        System.out.printf("실행 시간: %dns\n", (endTime - startTime));
        System.out.println("---------------------------------------");
    }
}