package week18.ch18_4.training1;

import java.util.Scanner;

public class Main {
    static int n;
    static int r;
    static StringBuilder sb = new StringBuilder();;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 0;
            boolean[] chk = new boolean[n+1];
            permutation(i, count, chk, "");
        }

        System.out.print(sb);
    }

    private static void permutation(int num, int count, boolean[] chk, String line) {

        line += num + " ";
        count ++;
        chk[num] = true;

        if(count == r) {
            sb.append(line).append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!chk[i]) {

                permutation(i, count, chk, line);
                chk[i] = false;
            }
        }
    }
}