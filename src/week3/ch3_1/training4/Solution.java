package week3.ch3_1.training4;

import java.util.ListIterator;

class Solution {

    public static void solution(ListIterator<Integer> iterator) {
        // 이곳에 정답 코드를 작성해 주세요.
        int count = 0;
        int now = 0;
        while(true) {
            if(iterator.hasNext()) {
                int next = iterator.next();
                if(now < next) {
                    count ++;                    
                }
                now = next;
            } else {
                break;
            }

        }
        System.out.println(count);
    }

    private Solution() {}
}
