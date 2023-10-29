import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int resultNum = 0;
        int max = 0;
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int[] arrABC = {A, B, C};
            if ( A == B ) {
                resultNum = ( B == C ) ? A * 1000 + 10000 : B * 100 + 1000;
            } else {
                if ( B == C ) {
                    resultNum = B * 100 + 1000;
                } else if ( A == C) {
                    resultNum = A * 100 + 1000;
                } else {
                    Arrays.sort(arrABC);
                    resultNum = arrABC[2] * 100;
                }
            }
            max = (max < resultNum) ? resultNum : max;
        }
        System.out.print(max);
        br.close();
    }
}
