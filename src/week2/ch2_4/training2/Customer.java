package week2.ch2_4.training2;

import java.sql.SQLOutput;

public class Customer {
    int money = 20000;

//    void buyCoffee(Americano americano) {
//        if (money < americano.price) {
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//        money = money - americano.price;
//        System.out.println("📣: " + americano + "를 주문했습니다.");
//    }
//
//    void buyCoffee(CaffeLatte caffeLatte) {
//        if (money < caffeLatte.price) {
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//        money = money - caffeLatte.price;
//        System.out.println("📣: " + caffeLatte + "를 주문했습니다.");
//    }

    // 지시 사항을 참고하여 코드를 작성해 보세요.
    void buyCoffee(Coffee coffee) {
        if(money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.println("📣: " + coffee + "를 주문했습니다.");
    }

}
