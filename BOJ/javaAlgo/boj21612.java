package BOJ.javaAlgo;

import java.io.*;

public class boj21612 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = (Integer.parseInt(br.readLine())*5) - 400;
        if ( P == 100 ) {
            System.out.print(P + "\n0");
        } else {
            System.out.print((P > 100) ? P + "\n-1" : P + "\n1");
        }
        br.close();        
    }
}
