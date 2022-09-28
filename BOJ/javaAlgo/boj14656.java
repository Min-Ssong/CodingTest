package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj14656 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for ( int i = 1; i <= T; i++ ) {
            int num = Integer.parseInt(st.nextToken());
            count += ( i == num ) ? 0 : 1;
        }
        System.out.print(count);
        br.close();
    }
}
