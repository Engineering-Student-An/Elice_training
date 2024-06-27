package week1.ch1_4;

public class ForLoopEx {
    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }

        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);

                // String format
                // System.out.println(STR."\{i}");

                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
