package week3.ch3_1.training3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfInstruction = sc.nextInt();

        for (int i = 0; i < numberOfInstruction; i++) {
            int instruction = sc.nextInt();
            String key = sc.next();
            int value = sc.nextInt();

            Menu.execute(instruction, key, value);
        }
    }
}