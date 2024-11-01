package week18.ch18_5.training1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

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
        }

        sb = new StringBuilder();
        boolean[] visit = new boolean[n+1];
        bfs(1, visit);

        System.out.println(sb);
    }

    private static void bfs(int v, boolean[] visit) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visit[v] = true;

        while(!queue.isEmpty()) {
            Integer now = queue.poll();
            sb.append(now).append(" ");
            while(!adjacentList[now].isEmpty()) {
                Integer next = adjacentList[now].poll();
                if(!visit[next]){
                    queue.add(next);
                    visit[next] = true;
                }
            }
        }
    }
}