package BOJ.javaAlgo;

import java.io.*;

public class boj4635 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            int N = Integer.parseInt(br.readLine());
            if ( N == -1 ) {
                System.out.print(result);
                break;
            }
            int[] miles = new int[N];
            int[] hours = new int[N];
            int[] pureHours = new int[N];
            for ( int i = 0; i < N; i++ ) {
                String allInput = br.readLine();
                miles[i] = Integer.parseInt(allInput.split(" ")[0]);
                pureHours[i] = Integer.parseInt(allInput.split(" ")[1]);
                if ( i != 0 ) {
                    hours[i] = Integer.parseInt(allInput.split(" ")[1]) - pureHours[i-1];
                } else {
                    hours[i] = Integer.parseInt(allInput.split(" ")[1]);
                }
            }
            int resultNum = 0;
            for ( int i = 0; i < miles.length; i++ ) {
                resultNum += miles[i] * hours[i];
            }
            result += resultNum + " miles\n";
        }
        br.close();
    }
}
