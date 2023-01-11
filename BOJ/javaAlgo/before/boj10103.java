package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj10103 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int scoreC = 100;
        int scoreS = 100;
        for ( int i = 0; i < n; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if ( c != s ) {
                if ( c > s ) {
                    scoreS -= c;
                } else {
                    scoreC -= s;
                }
            }
        }
        System.out.printf("%d\n%d", scoreC, scoreS);
        br.close();
    }
}
