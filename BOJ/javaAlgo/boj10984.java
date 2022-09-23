package BOJ.javaAlgo;

import java.io.*;
import java.util.StringTokenizer;

public class boj10984 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for ( int i = 0; i < T; i++ ) {
            Double numCG = 0.0;
            int numC = 0;
            int N = Integer.parseInt(br.readLine());
            for ( int j = 0; j < N; j++ ) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                Double C = Double.parseDouble(st.nextToken());
                Double G = Double.parseDouble(st.nextToken());
                numC += C;
                numCG += C * G;
            }
            sb.append(numC + " ");
            sb.append(String.format("%.1f", numCG / numC));
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
