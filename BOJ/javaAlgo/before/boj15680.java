package BOJ.javaAlgo.before;

import java.io.*;

public class boj15680 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print((N == 0) ? "YONSEI" : "Leading the Way to the Future");
        br.close();
    }
}
