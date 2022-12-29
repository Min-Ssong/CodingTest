package BOJ.javaAlgo.before;

import java.io.*;

public class boj2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N * 2 - 1;
        for ( int i = N - 1; i >= 0; i-- ) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(num - (i * 2)));
        }
        for ( int i = 1; i <= N - 1; i++ ) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(num - (i * 2)));
        }
        br.close();
    }
}
