package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;

public class boj25704 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());
        int[] resultInt = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        if ( N <= 5 ) {
            resultInt[0] = price;
            resultInt[1] = price - 500;
        } else if ( N >= 10 && N < 15 ) {
            resultInt[0] = price;
            resultInt[1] = price - 500;
            resultInt[2] = (int)(price * 0.9);
        } else if ( N >= 15 && N < 20 ) {
            resultInt[0] = price;
            resultInt[1] = price - 500;
            resultInt[2] = (int)(price * 0.9);
            resultInt[3] = price - 2000;
        } else if ( N >= 20 ) {
            resultInt[0] = price;
            resultInt[1] = price - 500;
            resultInt[2] = (int)(price * 0.9);
            resultInt[3] = price - 2000;
            resultInt[4] = (int)(price * 0.75);
        } else {
            resultInt[0] = price;
        }

        Arrays.sort(resultInt);
        System.out.print((price <= price - resultInt[0]) ? 0 : resultInt[0]);
        
        br.close();
    }
}
