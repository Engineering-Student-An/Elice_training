package week8.ch8_3.training1;

public class FactorialProxy implements Factorial {

    private Factorial delegator;

    // 지시사항을 참고하여 코드를 작성해 보세요.   
    
    public FactorialProxy (Factorial delegator) {
        this.delegator = delegator;
    }

    @Override
    public void factorial(long n) {
        // 지시사항을 참고하여 코드를 작성해 보세요.   
        long startTime = System.nanoTime();
		delegator.factorial(n);
        long endTime = System.nanoTime();

        // 프록시 작성 이후 아래 세 줄의 주석을 해제해 주세요.
        System.out.printf("호출 클래스: %s\n", delegator.getClass().getSimpleName());
        System.out.printf("실행 시간: %dns\n", (endTime - startTime));
        System.out.println("---------------------------------------");
    }
}