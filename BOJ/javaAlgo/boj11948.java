package BOJ.javaAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int[] arr = {A, B, C, D};
        Arrays.sort(arr);
        int result = 0;
        for ( int i = 1; i < arr.length; i++ ) {
            result += arr[i];
        }
        
        if ( E > F ) {
            result += E;
        } else {
            result += F;
        }
        System.out.printf("%d", result);

        br.close();
    }    
}
