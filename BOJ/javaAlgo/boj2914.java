package BOJ.javaAlgo;

import java.io.*;

public class boj2914 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int A = Integer.parseInt(allInput.split(" ")[0]);
        int I = Integer.parseInt(allInput.split(" ")[1]);
        System.out.println((A * (I - 1)) + 1);
        br.close();
    }
}
