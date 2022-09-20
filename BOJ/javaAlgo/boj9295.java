package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj9295 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case " + (i+1)).append(": " + (a+b)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
