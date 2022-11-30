package BOJ.javaAlgo;

import java.io.*;
import java.math.BigInteger;

public class boj15740 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String AB = br.readLine();
        BigInteger A = new BigInteger(AB.split(" ")[0]);
        System.out.println(A.add(new BigInteger(AB.split(" ")[1])));
        br.close();
    }
}
