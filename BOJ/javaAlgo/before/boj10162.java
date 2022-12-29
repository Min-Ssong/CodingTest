package BOJ.javaAlgo.before;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10162 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 300;
        int B = 60;
        int C = 10;
        int[] result = {0, 0, 0};

        int T = Integer.parseInt(br.readLine());
        if ( T % 10 == 0 ) {
            while ( T > 0 ) {
                if ( T >= A ) {
                    T = T - A;
                    result[0] += 1;
                } else if ( T >= B ) {
                    T = T - B;
                    result[1] += 1;
                } else if ( T >= C ) {
                    T = T - C;
                    result[2] += 1;
                }
            }
            for (int i : result) {
                bw.write(i + " ");
            }
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
