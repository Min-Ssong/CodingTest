package BOJ.javaAlgo.before;

import java.io.*;

public class boj13416 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            int day = Integer.parseInt(br.readLine());
            int result = 0;
            for ( int j = 0; j < day; j++ ) {
                String prices = br.readLine();
                String[] price = prices.split(" ");
                int A = Integer.parseInt(price[0]);
                int B = Integer.parseInt(price[1]);
                int C = Integer.parseInt(price[2]);
                int max = Math.max(A, Math.max(B, C));
                result += (max < 0) ? 0 : max;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
