package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2490 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for ( int i = 0; i < 3; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int[] ABCD = {A, B, C, D};
            Arrays.sort(ABCD);
            if ( A == 1 && B == 1 && C == 1 && D == 1 ) {
                result += "E\n";
            } else if ( A == 0 && B == 0 && C == 0 && D == 0 ) {
                result += "D\n";
            } else {
                if ( ABCD[1] == ABCD[2] ) {
                    result += ( ABCD[1] == 0 ) ? "C\n" : "A\n";
                } else {
                    result += "B\n";
                }
            }
        }
        System.out.print(result);
        br.close();
    }
}
