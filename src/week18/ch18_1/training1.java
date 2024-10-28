package week18.ch18_1;

import java.util.Scanner;

public class training1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            int N = scanner.nextInt();
            boolean isSquare = false;
            for(int j=1; j<=32; j++) {
                if(N == j*j) {
                    isSquare = true;
                }
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
