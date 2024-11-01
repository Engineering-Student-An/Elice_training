package week18.ch18_5.training4;

import java.util.*;

public class Main {
    static int[][] arr;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        boolean[][] visit = new boolean[n+1][m+1];

        bfs(1, 1, visit);

        System.out.println((visit[n][m]) ? arr[n][m]-1 : -1);
    }

    private static void bfs(int r, int c, boolean[][] visit) {

        int[] dirR = {0, 1, 0, -1};
        int[] dirC = {1, 0, -1, 0};

        visit[r][c] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});

        while(!queue.isEmpty()) {

            int[] poll = queue.poll();
            int nowR = poll[0];
            int nowC = poll[1];

            for (int i = 0; i < 4; i++) {
                int nextR = nowR + dirR[i];
                int nextC = nowC + dirC[i];
                if(arr[nextR][nextC] != 0 && !visit[nextR][nextC]) {
                    queue.add(new int[] {nextR, nextC});
                    visit[nextR][nextC] = true;
                    arr[nextR][nextC] = arr[nowR][nowC] + 1;
                }
            }
        }
    }


}