package BOJ.javaAlgo;

import java.io.*;

public class boj24883 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        System.out.print((N.equals("N") || N.equals("n")) ? "Naver D2" : "Naver Whale");
        br.close();
    }
}
