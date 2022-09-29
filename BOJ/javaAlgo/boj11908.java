package BOJ.javaAlgo;

import java.io.*;
import java.util.Arrays;

public class boj11908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String strs = br.readLine();
        String[] str = strs.split(" ");
        int[] intArr = new int[str.length];
        int sum = 0;
        for ( int i = 0; i < str.length; i++ ) {
            intArr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(intArr);
        for (int i : intArr) {
            sum += i;
        }
        sum -= intArr[intArr.length-1];
        System.out.println(sum);
        br.close();
    }
}