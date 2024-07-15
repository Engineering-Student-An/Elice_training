package week3.chaptertest.problem5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int itemCount = scanner.nextInt();
        int logCount = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> map = new TreeMap<>();

        // 여기에 코드를 작성해주세요.
        for (int i = 0; i < logCount; i++) {
            String itemName = scanner.next();
            String log = scanner.next();
            if(log.equals("acquire")) {
                if(!map.containsKey(itemName)) {
                    map.put(itemName, 1);
                }
                else {
                    map.put(itemName, map.get(itemName) + 1);
                }
            }
            else if(log.equals("use")) {
                if(map.containsKey(itemName)) {
                    map.put(itemName, map.get(itemName) - 1);
                }
            }
        }

        System.out.println(map);
    
    }       
}
