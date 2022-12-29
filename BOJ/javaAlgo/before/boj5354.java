package BOJ.javaAlgo.before;

import java.io.*;

public class boj5354 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result  = "";
        for ( int i = 0; i < N; i++ ) {
            int boxSize = Integer.parseInt(br.readLine());
            for ( int j = 0; j < boxSize; j++ ) {
                if ( j == 0 || j == boxSize - 1 ) {
                    result += "#".repeat(boxSize) + "\n";
                } else {
                    result += "#" + "J".repeat(boxSize - 2) + "#\n";
                }
            }
            result += "\n";
        }
        System.out.print(result);
        br.close();
    }
}
