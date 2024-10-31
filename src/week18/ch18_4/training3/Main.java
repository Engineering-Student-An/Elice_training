package week18.ch18_4.training3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int INFINITE = 9999999;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] result = new int[n+1];

        int[] temp = {0, INFINITE, INFINITE, 1, INFINITE, 1};

        if(n <= 5) {
            System.out.println(temp[n] == INFINITE ? -1 : temp[n]);
        } else {

            for (int i = 0; i < 6; i++) {
                result[i] = temp[i];
            }

            for (int i = 6; i <= n; i++) {
                result[i] = Math.min(result[i - 3], result[i - 5]);
                if (result[i] != INFINITE) result[i]++;
            }

            System.out.println(result[n] == INFINITE ? -1 : result[n]);
        }
    }
}