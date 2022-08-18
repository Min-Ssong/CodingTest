package BOJ.javaAlgo;

import java.io.*;

public class boj15025 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String moose = br.readLine();
        int A = Integer.parseInt(moose.split(" ")[0]);
        int B = Integer.parseInt(moose.split(" ")[1]);
        if ( A == B) {
            System.out.print((A != 0) ? "Even " + (A + B) : "Not a moose");
        } else {
            System.out.print((A > B) ? "Odd " + (A*2) : "Odd " + (B*2));
        }
        br.close();
    }
}
