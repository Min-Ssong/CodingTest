package BOJ.javaAlgo.before;

import java.io.*;

public class boj2985 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int A = Integer.parseInt(allInput.split(" ")[0]);
        int B = Integer.parseInt(allInput.split(" ")[1]);
        int C = Integer.parseInt(allInput.split(" ")[2]);

        if ( A + B == C ) {
            System.out.printf("%d+%d=%d", A, B, C);
        } else if ( A - B == C ) {
            System.out.printf("%d-%d=%d", A, B, C);
        } else if ( A * B == C ) {
            System.out.printf("%d*%d=%d", A, B, C);
        } else if ( A / B == C ) {
            System.out.printf("%d/%d=%d", A, B, C);
        } else if ( A == B + C ) {
            System.out.printf("%d=%d+%d", A, B, C);
        } else if ( A == B - C ) {
            System.out.printf("%d=%d-%d", A, B, C);
        } else if ( A == B * C ) {
            System.out.printf("%d=%d*%d", A, B, C);
        } else if ( A == B / C ) {
            System.out.printf("%d=%d/%d", A, B, C);
        }
        
        br.close();
    }
}
