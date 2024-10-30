package week18.ch18_3.training2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long result = 1;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();

            if(i >= n-2) {
                result *= m;
            }
        }

        System.out.println(result);
    }
}