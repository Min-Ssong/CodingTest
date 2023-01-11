package BOJ.javaAlgo.before;

import java.io.*;

public class boj10419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int num = 0;
        for ( int i = 0; i < T; i++ ) {
            int d = Integer.parseInt(br.readLine());
            int j = 1;
            while ( true ) {
                if ( d >= (j + Math.pow(j, 2)) ) {
                    num = j;
                } else {
                    break;
                }
                j += 1;
            }
            sb.append(num).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
