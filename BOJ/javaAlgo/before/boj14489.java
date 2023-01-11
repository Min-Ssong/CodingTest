package BOJ.javaAlgo.before;

import java.io.*;

public class boj14489 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String money = br.readLine();
        int a = Integer.parseInt(money.split(" ")[0]);
        int b = Integer.parseInt(money.split(" ")[1]);
        int chickens = Integer.parseInt(br.readLine()) * 2;
        System.out.print( ( a + b >= chickens ) ? (a + b) - chickens : a + b );

        br.close();
    }
}
