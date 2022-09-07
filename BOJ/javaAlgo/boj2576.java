package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj2576 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 100;
        int result = 0;
        for ( int i = 0; i < 7; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if ( num % 2 != 0 ) {
                min = ( num <= min ) ? num : min;
                result += num;
            }
        }
        if ( result == 0 ) {
            System.out.println("-1");
        } else {
            System.out.printf("%d\n%d", result, min);
        }
        br.close();
    }
}
