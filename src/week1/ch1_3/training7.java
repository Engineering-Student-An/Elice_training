package week1.ch1_3;

import java.util.Scanner;

public class training7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt(); // 손님에게 나이를 물어봅니다.
        int price ; // 입장료를 담을 변수

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        if(age <= 7) {
            price = 0;
        } else if(age<=13) {
            price = 5000;
        } else if(age <= 19) {
            price = 10000;
        } else {
            price = 20000;
        }


        System.out.println("고객님, 입장료는 " + price + "원이 되겠습니다.");
    }
}
