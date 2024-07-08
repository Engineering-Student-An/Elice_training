package week3.ch3_1.training2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 이곳에 답안 코드를 작성해 주세요.
        Scanner scanner = new Scanner(System.in);
        
        Set<String> set = new HashSet<>();
        int n = scanner.nextInt();
        for(int i=0;i<n;i++) {

            set.add(scanner.next());
        }

        System.out.println(set.size());
    }
}
