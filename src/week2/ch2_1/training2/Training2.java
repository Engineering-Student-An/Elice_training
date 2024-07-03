package week2.ch2_1.training2;


// Order 클래스를 선언하고, 멤버 변수와 메서드(printOrderInfo)를 작성해 주세요.
class Order {
    public String menu;
    public int price;

    public void printOrderInfo() {
        System.out.println("주문한 메뉴는 " + this.menu + ", 가격은 " + price + "원입니다.");
    }
}

public class Training2 {
    public static void main(String args[]) {

        // 여기에 인스턴스를 생성하고 멤버 변수를 초기화합니다.
        Order order = new Order();
        order.menu = "아메리카노";
        order.price = 4000;

        order.printOrderInfo();
    }
}
