package week18.ch18_5.training2;

import java.util.*;

public class Main {
    static PriorityQueue<Integer>[] adjacentList;
    static StringBuilder sb;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        adjacentList = new PriorityQueue[n+1];
        for (int i = 1; i <= n; i++) {
            adjacentList[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adjacentList[u].add(v);
            adjacentList[v].add(u);
        }

        sb = new StringBuilder();
        boolean[] visit = new boolean[n+1];

        dfs(1, visit);

        System.out.println(sb);
    }

    private static void dfs(int v, boolean[] visit) {

        sb.append(v).append(" ");
        visit[v] = true;

        while(!adjacentList[v].isEmpty()) {
            Integer poll = adjacentList[v].poll();
            if(!visit[poll]) {
                dfs(poll, visit);
            }
        }
    }
}