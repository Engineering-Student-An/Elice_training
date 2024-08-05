package week6.chaptertest.problem1;

import com.elice.elice_academy.cart.Cart;
import com.elice.elice_academy.discount.Discount;
import com.elice.elice_academy.discount.discountCondition.DiscountCondition;
import com.elice.elice_academy.discount.discountCondition.ElicerDiscountCondition;
import com.elice.elice_academy.discount.discountCondition.NewComerDiscountCondition;
import com.elice.elice_academy.discount.discountPolicy.FixedAmountDiscountPolicy;
import com.elice.elice_academy.discount.discountPolicy.FixedRateDiscountPolicy;
import com.elice.elice_academy.subject.SubjectRepository;
import week3.ch3_4.training4.Order;

import java.util.Scanner;

public class OrderApplication {
    public void init() {

        Scanner scanner = new Scanner(System.in);

        SubjectRepository subjectRepository = new SubjectRepository();
        Cart cart = new Cart(subjectRepository);

        Order order = new Order(cart, new Discount(
                 new DiscountCondition[] {
                    // 지시사항을 참고하여 각 인스턴스에 의존성을 주입해 주세요.
                    new NewComerDiscountCondition(new FixedRateDiscountPolicy(30)),
                    new ElicerDiscountCondition(new FixedRateDiscountPolicy(30))
                }
        ));


        System.out.println("\n🐰 : 엘리스 아카데미에 오신 것을 환영합니다!");
        System.out.println("🐰 : 수강하기 원하는 과목을 선택해 주세요.\n");

        while (true) {
            subjectRepository.printAllSubjects();
            String input = scanner.nextLine();

            if (input.equals("+")) {
                // 주문 내역 출력
                order.confirmOrder();
                break;
            } else {
                int inputNumber = Integer.parseInt(input);

                if(inputNumber == 0) cart.printCart();
                else if(1 <= inputNumber && inputNumber <= subjectRepository.getAllSubjects().size()) cart.addToCart(inputNumber);
            }
        }
    }
}
