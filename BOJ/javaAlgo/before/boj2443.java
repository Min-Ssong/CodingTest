package BOJ.javaAlgo.before;

import java.io.*;

public class boj2443 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N * 2 - 1;
        int temp = 1;
        for ( int i = num; i >= 1; i -= 2 ) {
            if ( i != num ) {
                System.out.print(" ".repeat(num - i - temp));
                temp += 1;
            }
            System.out.println("*".repeat(i));
        }
        br.close();
    }
}
