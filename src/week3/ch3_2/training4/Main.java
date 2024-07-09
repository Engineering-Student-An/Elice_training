package week3.ch3_2.training4;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        scanner.close();

        System.out.println(solution(first, second));
    }
    
    public static BigInteger solution(String first, String second) {
        BigInteger f = new BigInteger(first);
        BigInteger s = new BigInteger(second);

        // 여기에 코드 작성
        return f.multiply(s);
    }
}

