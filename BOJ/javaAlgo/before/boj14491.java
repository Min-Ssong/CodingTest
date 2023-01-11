package BOJ.javaAlgo.before;

import java.io.*;

public class boj14491 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(Integer.toString(num, 9));
        br.close();
    }
}
