package week18.ch18_3.training1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();

            if(i >= n-2) {
                result *= m;
            }
        }

        System.out.println(result);
    }
}