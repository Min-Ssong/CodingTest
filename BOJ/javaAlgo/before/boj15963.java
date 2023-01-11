package BOJ.javaAlgo.before;

import java.io.*;

public class boj15963 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NM = br.readLine();
        String N = NM.split(" ")[0];
        String M = NM.split(" ")[1];
        System.out.println((N.equals(M)) ? "1" : "0");
        br.close();
    }
}
