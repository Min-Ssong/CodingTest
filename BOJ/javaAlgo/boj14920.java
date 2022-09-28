package BOJ.javaAlgo;

import java.io.*;

public class boj14920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int count = 1;
        while ( C != 1 ) {
            C = ( C % 2 == 0 ) ? C / 2 : 3 * C + 1;
            count += 1;
        }
        System.out.print(count);
        br.close();
    }
}
