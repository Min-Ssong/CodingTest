package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj10599 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if ( a == 0 && b == 0 && c == 0 && d == 0 ) {
                System.out.print(sb);
                break;
            }
            sb.append((c - b) + " " + (d - a)).append("\n");
        }
        br.close();
    }
}
