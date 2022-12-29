package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj10865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nm = br.readLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);
        int[] friend = new int[n];
        for ( int i = 0; i < m; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            friend[x-1] += 1;
            friend[y-1] += 1;
        }
        for (int i : friend) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}