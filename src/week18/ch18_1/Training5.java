package week18.ch18_1;

import java.util.Scanner;

public class Training5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {

            int str = scanner.nextInt();

            if(isPrime(str) && isPalindrome(str)) {
                count ++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int str) {

        int sqrt = (int) Math.sqrt(str);
        if(sqrt * sqrt == str) return false;

        for (int i = 2; i < sqrt; i++) {
            if(str % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome(int str) {
        String string = String.valueOf(str);
        for (int j = 0; j < string.length()/2; j++) {
            if(string.charAt(j) != string.charAt(string.length() - 1 - j)) {
                return false;
            }
        }

        return true;
    }
}
