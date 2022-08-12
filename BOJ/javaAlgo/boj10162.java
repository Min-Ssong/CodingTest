package BOJ.javaAlgo;

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
        int i = 1;
        int result = 0;

        int T = Integer.parseInt(br.readLine());
        if ( T % 10 == 0 ) {
            while ( true ) {
                
                if ( T - A * i > 0 ) {

                    i = i + 1;
                } else {
                    break;
                }
            }
        } else {
            bw.write(-1);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
