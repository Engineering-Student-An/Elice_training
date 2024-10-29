package week18.ch18_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Training2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = scanner.nextBigInteger();

            boolean isSquare = false;
            for(int j=1; j<=1000000; j++) {
                if (n.equals(BigInteger.valueOf((long) j * j))) {
                    isSquare = true;
                    break;
                }
                if(BigInteger.valueOf((long) j * j).compareTo(n) > 0) break;
            }

            if(isSquare) {
                sb.append("Odd\n");
            } else {
                sb.append("Even\n");
            }
        }

        System.out.print(sb);
    }
}
