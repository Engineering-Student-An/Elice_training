package week3.chaptertest.problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 이 곳에 정답 코드를 작성해 주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] ids = new int[m];
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < m; i++) {
            ids[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if(set.size() == n) {
                break;
            }

            if(!set.contains(ids[i])) {
                set.add(ids[i]);
            }
        }

        List<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}


