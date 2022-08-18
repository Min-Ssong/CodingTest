package BOJ.javaAlgo;

import java.io.*;

public class boj14623 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if ( a.length() != 4 ) {
            int repeatNum = 4 - a.length();
            a = "0".repeat(repeatNum) + a;
        }

        if ( b.length() != 4 ) {
            int repeatNum = 4 - b.length();
            b = "0".repeat(repeatNum) + b;
        }
        Long tenA = Long.valueOf(a, 2);
        Long tenB = Long.valueOf(b, 2);
        System.out.print(Long.toBinaryString(tenA * tenB));;
        br.close();
    }
}
