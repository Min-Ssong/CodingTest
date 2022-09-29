package BOJ.javaAlgo;

import java.io.*;

public class boj11721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int num = s.length();
        while ( num >= 10 ) {
            sb.append(s.substring(0, 10) + "\n");
            s = s.substring(10);
            num = s.length();
        }
        sb.append(s + "\n");
        System.out.print(sb);
        br.close();
    }
}