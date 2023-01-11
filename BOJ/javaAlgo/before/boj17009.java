package BOJ.javaAlgo.before;

import java.io.*;

public class boj17009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A_3 = Integer.parseInt(br.readLine());
        int A_2 = Integer.parseInt(br.readLine());
        int A_1 = Integer.parseInt(br.readLine());

        int B_3 = Integer.parseInt(br.readLine());
        int B_2 = Integer.parseInt(br.readLine());
        int B_1 = Integer.parseInt(br.readLine());

        int resultA = (A_3 * 3) + (A_2 * 2) + A_1;
        int resultB = (B_3 * 3) + (B_2 * 2) + B_1;
        if ( resultA == resultB ) {
            System.out.print("T");
        } else {
            System.out.print( (resultA > resultB) ? "A" : "B" );
        }
        br.close();
    }
}
