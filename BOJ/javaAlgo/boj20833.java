package BOJ.javaAlgo;

import java.io.*;

public class boj20833 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = 0;
        for ( int i = 1; i <= input; i++ ) {
            result += Math.pow(i, 3);
        }
        System.out.print(result);
        br.close();
    }    
}
