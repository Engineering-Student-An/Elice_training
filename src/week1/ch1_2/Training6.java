package week1.ch1_2;

import java.util.Scanner;

public class Training6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        boolean isAdult = scanner.nextBoolean();
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        double monthlyIncome = scanner.nextDouble();
        // 지시사항 3번을 참고하여 코드를 작성하세요.
        int creditScore = scanner.nextInt();
        // 지시사항 4번을 참고해 주세요.
        System.out.println("성인 여부: " + isAdult);
        System.out.println("월 수입이 기준치 이상인가요? " + (monthlyIncome >= 170));
        System.out.println("신용 점수가 기준치 이상인가요? " + (creditScore >= 650));

        // 대출 승인 가능 여부를 계산합니다.
        boolean isApproved = (isAdult && (monthlyIncome >= 170) && (creditScore >= 650));
        System.out.println("대출 승인 가능 여부: " + isApproved);
    }
}
