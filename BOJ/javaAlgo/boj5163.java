package BOJ.javaAlgo;

import java.io.*;

public class boj5163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < K; i++ ) {
            String bw = br.readLine();
            int b = Integer.parseInt(bw.split(" ")[0]);
            Double w = Double.parseDouble(bw.split(" ")[1]);
            Double resultDouble = 0.0;
            for ( int j = 0; j < b; j++ ) {
                Double r = Double.parseDouble(br.readLine());
                resultDouble += (4.0 / 3.0 * Math.PI * Math.pow(r, 3)) / 1000;
            }
            result += ( resultDouble >= w ) 
                ? "Data Set " + (i+1) + ":\nYes\n\n" 
                : "Data Set " + (i+1) + ":\nNo\n\n";
        }
        System.out.print(result);
        br.close();
    }
}