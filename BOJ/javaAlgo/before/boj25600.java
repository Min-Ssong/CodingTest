package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj25600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int dg = d + g;
            int adg = a * dg;
            temp = (a == dg) ? adg * 2 : adg;
            max = (max < temp) ? temp : max;
        }
        System.out.print(max);
        br.close();
    }
}
