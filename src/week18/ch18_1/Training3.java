package week18.ch18_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Training3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int gcd = gcd(n, m);
        BigInteger lcm = BigInteger.valueOf(n).multiply(BigInteger.valueOf(m)).divide(BigInteger.valueOf(gcd));
        System.out.println(gcd + " " + lcm);
    }

    public static int gcd(int n, int m) {

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while(max % min != 0) {
            max = max % min;

            int temp = max;
            max = min;
            min = temp;
        }

        return min;
    }
}
