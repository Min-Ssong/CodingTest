package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj9501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            Double resultDouble = 0.0;
            int count = 0;
            for ( int j = 0; j < N; j++ ){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                Double v = Double.parseDouble(st2.nextToken());
                Double f = Double.parseDouble(st2.nextToken());
                Double c = Double.parseDouble(st2.nextToken());
                resultDouble = v * (f / c);
                if ( D <= resultDouble ) {
                    count += 1;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
