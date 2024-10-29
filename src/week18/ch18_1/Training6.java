package week18.ch18_1;

import java.util.Scanner;

public class Training6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int sum = 0;
        boolean isCorrect = true;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '(') sum += 1;
            else sum -= 1;

            if(sum < 0) {
                isCorrect = false;
                break;
            }
        }

        System.out.println( (isCorrect && sum ==0) ? "YES" : "NO");
    }
}
