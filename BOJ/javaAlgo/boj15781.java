package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj15781 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        int result = 0;
        for ( int i = 0; i < 2; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = Integer.MIN_VALUE;
            while ( st.hasMoreTokens() ) {
                int num = Integer.parseInt(st.nextToken());
                max = max < num ? num : max;
            }
            result += max;
        }
        System.out.print(result);
        br.close();
    }
}

