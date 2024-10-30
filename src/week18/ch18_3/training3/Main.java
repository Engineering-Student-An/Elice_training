package week18.ch18_3.training3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hundred = n / 100;
        n%=100;

        int ten = n / 10;

        System.out.println(hundred + ten);
    }
}