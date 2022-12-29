package BOJ.javaAlgo.before;

import java.io.*;

public class boj3578 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if ( num == 1 ) {
            System.out.println("0");
        } else if ( num == 0 ) {
            System.out.println("1");
        } else if ( num % 2 == 0 ) {
            System.out.print("8".repeat(num / 2));
        } else if ( num % 2 != 0 ) {
            System.out.print("4" + "8".repeat(num / 2));
        }
        br.close();
    }
}
