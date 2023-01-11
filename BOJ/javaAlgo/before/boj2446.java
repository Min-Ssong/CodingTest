package BOJ.javaAlgo.before;

import java.io.*;

public class boj2446 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N * 2 - 1;
        for ( int i = 0; i < N; i++ ) {
            System.out.printf("%s%s\n",
                " ".repeat(i),
                "*".repeat(num - (i*2))
            );
        }
        for ( int i = N - 2; i >= 0; i-- ) {
            System.out.printf("%s%s\n",
                " ".repeat(i),
                "*".repeat(num - (i*2))
            );
        }
        br.close();
    }
}
