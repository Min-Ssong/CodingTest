package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj22015 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int[] num = new int[3];
        for ( int i = 0; i < inputs.length; i++ ) {
            num[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(num);
        System.out.print((num[2] - num[0]) + (num[2] - num[1]));
        br.close();
    }
}
