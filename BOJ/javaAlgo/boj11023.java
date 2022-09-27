package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj11023 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        while ( st.hasMoreTokens() ) {
            num += Integer.parseInt(st.nextToken());
        }
        System.out.print(num);
        br.close();
    }
}
