package BOJ.javaAlgo;

import java.io.*;

public class boj2863 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();
        String CD = br.readLine();
        int A = Integer.parseInt(AB.split(" ")[0]);
        int B = Integer.parseInt(AB.split(" ")[1]);
        int C = Integer.parseInt(CD.split(" ")[0]);
        int D = Integer.parseInt(CD.split(" ")[1]);
        int[] num = { A/C + B/D, C/D + A/B, D/B + C/A, B/A + D/C};
        int max = 0;
        int result = 0;
        for ( int i = 0; i < num.length; i++ ) {
            if ( max <= num[i] ) {
                max = num[i];
                result = i;
            }
        }
        System.out.println(result);
        br.close();
    }
}
