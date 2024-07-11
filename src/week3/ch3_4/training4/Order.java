package week3.ch3_4.training4;

public class Order {
    private static final int MAX_CHEESE_ALLOWED = 1000;

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    public void orderCheesePizza(int requiredCheeseAmount) throws ExcessiveCheeseException {
        if(requiredCheeseAmount > MAX_CHEESE_ALLOWED) {
            throw new ExcessiveCheeseException(MAX_CHEESE_ALLOWED, requiredCheeseAmount, "주문 가능한 치즈의 양을 초과하였습니다.");
        } else {
            System.out.println("치즈 피자 주문이 성공적으로 완료되었습니다.");
        }

    }
}
