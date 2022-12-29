package BOJ.javaAlgo.before;

import java.io.*;

public class boj15917 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            int a = Integer.parseInt(br.readLine());
            sb.append( ( (a&(-a)) == a ) ? "1" : "0" ).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
