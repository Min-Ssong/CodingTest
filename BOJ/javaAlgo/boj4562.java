package BOJ.javaAlgo;

import java.io.*;

public class boj4562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < N; i++ ) {
            String brains = br.readLine();
            int a = Integer.parseInt(brains.split(" ")[0]);
            int b = Integer.parseInt(brains.split(" ")[1]);
            result += ( a < b ) ? "NO BRAINS\n" : "MMM BRAINS\n";
        }
        System.out.print(result);
        br.close();
    }
}
