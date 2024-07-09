package week3.ch3_2.training2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        System.out.println(solution(first, second));
    }
    
    public static int solution(String first, String second) {
        // 여기에 코드 작성
        first = first.toUpperCase();
        second = second.toUpperCase();

        if(first.contains(second) || second.contains(first)) {
            return 1;
        }
        return 0;
    }
}

