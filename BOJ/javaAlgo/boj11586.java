package BOJ.javaAlgo;

import java.io.*;

public class boj11586 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for ( int i = 0; i < N; i++ ) {
            String str = br.readLine();
            sb1.append(str + "\n");

            String[] str2 = str.split("");
            for ( int j = str2.length - 1; j >= 0; j-- ) {
                sb2.append(str2[j]);
            }
            sb2.append("\n");

            sb3.insert(0, str + "\n");
        }

        int K = Integer.parseInt(br.readLine());
        if ( K == 1 ) {
            System.out.print(sb1);
        } else if ( K == 2 ) {
            System.out.print(sb2);
        } else if ( K == 3 ) {
            System.out.print(sb3);
        }
        br.close();
    }
}

