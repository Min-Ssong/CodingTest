package BOJ.javaAlgo.before;

import java.io.*;

public class boj17863 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phoneNum = br.readLine().substring(0, 3);
        System.out.println( (phoneNum.equals("555")) ? "YES" : "NO");
        br.close();
    }
}
