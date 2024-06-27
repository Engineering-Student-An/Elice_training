package week1.ch1_2;

import java.util.Scanner;

public class Training7 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
        Scanner scanner = new Scanner(System.in);

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        int year = scanner.nextInt();
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        int currentYear = 2024;
        // 지시사항 3번을 참고하여 코드를 작성하세요.
        int myAge = currentYear - year;

        System.out.println("올해 당신의 나이는 " + myAge + "살 입니다.");
    }
}
