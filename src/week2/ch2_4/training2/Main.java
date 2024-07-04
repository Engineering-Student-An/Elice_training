package week2.ch2_4.training2;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Americano americano = new Americano();
        CaffeLatte caffeLatte = new CaffeLatte();

        customer.buyCoffee(americano);
        customer.buyCoffee(caffeLatte);

        System.out.println("💵: 현재 남은 잔액은 " + customer.money + "원 입니다.");
    }
}
