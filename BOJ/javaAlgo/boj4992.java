package BOJ.javaAlgo;

import java.io.*;

public class boj4992 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            int N = Integer.parseInt(br.readLine());
            if ( N == 0 ) {
                System.out.print(result);
                break;
            }

            result += N + " => " + ((N*N)-(N-1)) + "\n";
        }
        br.close();
    }
}
