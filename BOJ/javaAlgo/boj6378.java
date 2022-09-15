package BOJ.javaAlgo;

import java.io.*;
import java.math.BigInteger;

public class boj6378 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while ( true ) {
            String N = br.readLine();
            if ( N.equals("0") ) {
                System.out.print(sb);
                break;
            }

            String temp = N;
            while ( true ) {
                if ( temp.length() == 1 ) {
                    sb.append(temp+"\n");
                    break;
                }

                BigInteger bi_1 = new BigInteger(temp.substring(0, temp.length() / 2));
                BigInteger bi_2 = new BigInteger(temp.substring(temp.length() / 2, temp.length()));
                temp = (bi_1.add(bi_2)).toString();
            }
        }
        
        br.close();
    }
}
