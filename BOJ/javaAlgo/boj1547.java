package BOJ.javaAlgo;

import java.io.*;

public class boj1547 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ball = "1";
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ){
            String AB = br.readLine();
            String A = AB.split(" ")[0];
            String B = AB.split(" ")[1];
            if ( ball.equals(A) ) {
                ball = B;
            } else if ( ball.equals(B) ){
                ball = A;
            }
        }
        System.out.print(ball);
        br.close();
    }
}
