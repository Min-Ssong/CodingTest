package BOJ.javaAlgo;

import java.io.*;

public class boj15351 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            int result = 0;
            String word = br.readLine();
            for ( int j = 0; j < word.length(); j++ ) {
                if ( word.charAt(j) != ' ') {
                    result += (int)word.charAt(j) - 64;
                }
            }
            sb.append((result == 100) ? "PERFECT LIFE" : result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
