package week1.ch1_3;

import java.util.Scanner;

public class Training5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        if(a>b) {
            System.out.println("A가 더 큽니다.");
        } else if(a<b) {
            System.out.println("B가 더 큽니다.");
        } else {
            System.out.println("크기가 같습니다.");
        }
    }
}
