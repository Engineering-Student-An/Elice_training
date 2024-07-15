package week3.chaptertest.problem2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
        //여기에 코드를 작성해주세요.    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            String string = scanner.next();

            if(string.equals("add")) {
                String name = scanner.next();

                stack.add(name);
            } else if(string.equals("remove")) {
                stack.pop();
            }
        }

        for (String string : stack) {
            System.out.println(string);
        }
    }
}
