package BOJ.javaAlgo;

import java.io.*;

public class boj14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nmk = br.readLine();
        int n = Integer.parseInt(nmk.split(" ")[0]);
        int m = Integer.parseInt(nmk.split(" ")[1]);
        int k = Integer.parseInt(nmk.split(" ")[2]);
        int num = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if ( k == num ) {
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
                num += 1;
            }
        }
        br.close();
    }
}
