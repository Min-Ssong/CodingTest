package BOJ.javaAlgo.before;

import java.io.*;

public class boj10179 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            Double price = Double.parseDouble(br.readLine());
            sb.append(String.format("$%.2f", price * 0.8)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
