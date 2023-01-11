package BOJ.javaAlgo.before;

import java.io.*;

public class boj18398 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ){
            int N = Integer.parseInt(br.readLine());
            for ( int j = 0; j < N; j++ ) {
                String allInput = br.readLine();
                int A = Integer.parseInt(allInput.split(" ")[0]);
                int B = Integer.parseInt(allInput.split(" ")[1]);
                result += A+B + " " + A*B + "\n";
            }
        }
        System.out.print(result);
        br.close();
    }
}
