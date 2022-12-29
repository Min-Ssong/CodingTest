package BOJ.javaAlgo.before;

import java.io.*;

public class boj13752 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            int num = Integer.parseInt(br.readLine());
            sb.append("=".repeat(num)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
