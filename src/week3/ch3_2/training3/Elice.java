package week3.ch3_2.training3;

import java.util.Arrays;

public class Elice {

    public static int solution(int[] input, int target) {
        // 이곳에 코드를 작성해 주세요.
        Arrays.sort(input);

        int index = Arrays.binarySearch(input, target);
        if(index >= 0) {
            return index;
        }
        return -1;
    }

    private Elice() {}
}
