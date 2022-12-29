package BOJ.javaAlgo.before;

import java.io.*;
import java.math.BigInteger;

public class boj13277 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();
        String[] tempAB = AB.split(" ");
        BigInteger bi_1 = new BigInteger(tempAB[0]);
        System.out.print(bi_1.multiply(new BigInteger(tempAB[1])));
        br.close();
    }
}