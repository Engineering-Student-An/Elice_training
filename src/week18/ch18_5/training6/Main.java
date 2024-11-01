package week18.ch18_5.training6;

import java.util.*;

public class Main {
    static ArrayList<Integer>[] adjacentList;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        adjacentList = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adjacentList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adjacentList[u].add(v);
            adjacentList[v].add(u);
        }

        boolean[] visit = new boolean[n+1];

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(!visit[i]) {
                bfs(i, visit);
                count ++;
            }
        }

        System.out.println(count);
    }

    private static void bfs(int v, boolean[] visit) {

        visit[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (Integer i : adjacentList[poll]) {
                if(!visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }


}