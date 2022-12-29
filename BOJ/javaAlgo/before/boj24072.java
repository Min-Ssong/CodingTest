package BOJ.javaAlgo.before;

import java.io.*;

public class boj24072 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int C = Integer.parseInt(temp[2]);
        if ( A <= C && C < B ){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        br.close();
    }
}
