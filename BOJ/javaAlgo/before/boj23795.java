package BOJ.javaAlgo.before;

import java.io.*;

public class boj23795 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while ( true ) {
            int N = Integer.parseInt(br.readLine());
            if ( N == -1 ) {
                System.out.print(result);
                break;
            }
            result += N;
        }
        br.close();
    }
}
