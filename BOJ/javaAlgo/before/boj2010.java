package BOJ.javaAlgo.before;

import java.io.*;

public class boj2010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for ( int i = 0; i < N; i++ ) {
            int M = Integer.parseInt(br.readLine());
            if ( i == N - 1 ) {
                result += M;
            } else {
                result += M - 1;
            }
        }
        System.out.print(result);
        br.close();
    }
}
