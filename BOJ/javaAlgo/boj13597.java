package BOJ.javaAlgo;

import java.io.*;

public class boj13597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        int A = Integer.parseInt(inputs.split(" ")[0]);
        int B = Integer.parseInt(inputs.split(" ")[1]);

        System.out.println( ( A == B ) ? A : ( A > B ) ? A : B );

        br.close();
    }
}
