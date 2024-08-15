package week8.ch8_4.training1;

public class ExceptionHandlingTest {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(10000000);

        // 지시사항을 참고하여 코드를 작성해 보세요. 
        try {
            bank.withdraw(10000001);
        } catch (InsufficientException e) {
            System.out.println("Task :ExceptionHandlingTest.main()");
            System.out.println("에러메시지: " + e.getMessage());
        }
    }
}
