package week18.ch18_1;

import java.util.Scanner;

public class Training4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] isPrime = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {

            if(isPrime[i]) {
                count ++;
                for (int j = i*2; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println(count);
    }
}
