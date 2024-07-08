package week3.ch3_1.training1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            arr.add(i);
        }

        while(true) {
            int n = scanner.nextInt();
            if(n == -1) break;
            arr.add(arr.remove(n-1));

        }

        System.out.println(arr);
    }
}
