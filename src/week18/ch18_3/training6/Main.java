package week18.ch18_3.training6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] partSum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            partSum[i] += partSum[i-1] + arr[i];
        }

        int max = - 9999999;
        for (int i = m; i <= n; i++) {
            max = Math.max(partSum[i] - partSum[i-m], max);
        }

        System.out.println(max);
    }
}