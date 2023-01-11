package BOJ.javaAlgo.before;

import java.io.*;

public class boj16204 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int N = Integer.parseInt(allInput.split(" ")[0]);
        int M = Integer.parseInt(allInput.split(" ")[1]);
        int K = Integer.parseInt(allInput.split(" ")[2]);
        int result = 0;
        
        result += ( M <= K ) ? M : K;
        result += (N-M <= N-K) ? N-M : N-K;
        System.out.print(result);

        br.close();
    }
}
