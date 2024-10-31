package week18.ch18_4.training2;

import java.util.Scanner;

public class Main {

    static int count = 0;
    static int n;
    static int r;
    static int c;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        r = scanner.nextInt();
        c = scanner.nextInt();

        int startR = 0;
        int endR = (int) (Math.pow(2, n)-1);

        int startC = 0;
        int endC = (int) (Math.pow(2, n)-1);

        sol(startR, endR, startC, endC);

        System.out.println(count);
    }

    private static void sol(int startR, int endR, int startC, int endC) {

        while(startR < endR && startC < endC) {

            int middleR = (startR + endR) / 2;
            int middleC = (startC + endC) / 2;

            int onePart = (endR-middleR) * (endR-middleR);

            if(r <= middleR && c <= middleC) {  //  1사분면
                endR = middleR;
                endC = middleC;
            } else if(r <= middleR) {           // 2사분면
                endR = middleR;
                startC = middleC + 1;
                count += onePart;
            } else if(c <= middleC) {           // 3사분면
                startR = middleR + 1;
                endC = middleC;
                count += onePart*2;
            } else {                            // 4사분면
                startR = middleR + 1;
                startC = middleC + 1;
                count += onePart*3;
            }
        }
    }
}