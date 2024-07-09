package week3.ch3_2.training5;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 이곳에 답안 코드를 작성해 주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();

        LocalTime localTime = LocalTime.of(hour, minute, second);
        localTime = localTime.plusMinutes(n);

        System.out.println(localTime.toString());
    }
}
