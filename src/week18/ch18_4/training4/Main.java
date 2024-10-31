package week18.ch18_4.training4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] result = new long[n+1];

        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i-1] + result[i-2];
        }

        System.out.println(result[n]);
    }
}