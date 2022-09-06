package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        for ( int i = 0; i < N; i++ ) {
            String AB = br.readLine();
            int A = Integer.parseInt(AB.split(" ")[0]);
            int B = Integer.parseInt(AB.split(" ")[1]);
            result[i] = (A <= B) ? B : -1;
        }

        for ( int i = 0; i < result.length; i++ ) {
            if ( result[i] == -1 ) {
                result[i] = 1001;
            }
        }
        Arrays.sort(result);
        System.out.print((result[0] == 1001) ? "-1" : result[0]);
        br.close();
    }
}
