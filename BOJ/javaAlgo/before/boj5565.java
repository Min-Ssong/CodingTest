package BOJ.javaAlgo.before;

import java.io.*;

public class boj5565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int allPrice = Integer.parseInt(br.readLine());
        int anotherPrice = 0;
        for ( int i = 0; i < 9; i++ ) {
            anotherPrice += Integer.parseInt(br.readLine());
        }
        System.out.println(allPrice - anotherPrice);
        br.close();
    }
}
