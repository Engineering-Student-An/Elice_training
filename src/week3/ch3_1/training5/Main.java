package week3.ch3_1.training5;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        while(true) {
            int firstNum = scanner.nextInt();
            if(firstNum == 0) {
                int id = scanner.nextInt();
                list.addLast(id);
            } else if(firstNum == 1) {
                int id = scanner.nextInt();
                list.addFirst(id);
            } else if(firstNum == 2) {
                list.removeFirst();
            } else if(firstNum == -1) {
                break;
            }
        }
        for(Integer integer : list) {
            System.out.print(integer + " ");
        }

//        Iterator<Integer> iterator = list.listIterator();
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
    }
}
