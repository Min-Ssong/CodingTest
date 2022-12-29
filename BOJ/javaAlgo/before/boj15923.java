package BOJ.javaAlgo.before;

import java.io.*;

public class boj15923 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        for ( int i = 0; i < N; i++ ) {
            String nums = br.readLine();
            int num_1 = Integer.parseInt(nums.split(" ")[0]);
            int num_2 = Integer.parseInt(nums.split(" ")[1]);
            x[i] = num_1;
            y[i] = num_2;
        }
        int resultX = 0;
        int resultY = 0;
        for ( int i = 0; i < x.length; i++ ) {
            if ( i == x.length - 1 ) {
                resultX += Math.abs(x[i] - x[0]);
                resultY += Math.abs(y[i] - y[0]);
            } else {
                resultX += Math.abs(x[i] - x[i + 1]);
                resultY += Math.abs(y[i] - y[i + 1]);
            }
        }
        System.out.print(resultX + resultY);
        br.close();
    }
}
