package week3.ch3_1.training3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Menu {
    static private final Map<String, Integer> menuMap = new HashMap<>();

    static public void execute(int instruction, String key, Integer value) {
        // 이곳에 답안을 작성해 주세요.
        if(instruction == 0) {
            menuMap.put(key, value);
        } else if(instruction == 1) {
            menuMap.remove(key);
        } else if(instruction == 2) {
            if(menuMap.get(key) != null) {
                System.out.println(menuMap.get(key) * value);
            } else {
                System.out.println(0);
            }
        }
    }

    private Menu() {}
}
