package BOJ.javaAlgo;

import java.io.*;

public class boj6190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        int score = 0;
        while ( N != 1 ) {            
            if ( N % 2 == 0 ) {
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }
            score++;
        }
        System.out.print(score);
        br.close();
    }
}
