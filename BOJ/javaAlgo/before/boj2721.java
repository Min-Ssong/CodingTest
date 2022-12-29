package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj2721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boj2721 boj = new boj2721();
        int T = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int temp = 0;
            for ( int k = 1; k <= n; k++ ) {
                temp += boj.Tn(k+1) * k;
            }
            result += temp + "\n";
        }
        System.out.print(result);
        br.close();
    }
    int Tn (int n) {
        int num = 0;
        for ( int i = 1; i <= n; i++ ) {
            num += i;
        }
        return num;
    }
}
