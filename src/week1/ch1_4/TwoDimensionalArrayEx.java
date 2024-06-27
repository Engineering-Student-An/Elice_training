package week1.ch1_4;

public class TwoDimensionalArrayEx {

    public static void main(String[] args) {

        int[][] data = {{1, 2, 3},
                        {4, 5, 6} };
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
