package BOJ.javaAlgo.before;

import java.io.*;

public class boj5607 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numA = 0;
        int numB = 0;
        for ( int i = 0; i < N; i++ ) {
            String AB = br.readLine();
            int A = Integer.parseInt(AB.split(" ")[0]);
            int B = Integer.parseInt(AB.split(" ")[1]);
            if ( A == B ) {
                numA += A;
                numB += B;
            } else if ( A > B ) {
                numA += A + B;
            } else if ( A < B ) {
                numB += A + B;
            }
        }
        System.out.print(numA + " " + numB);
        br.close();
    }
}
