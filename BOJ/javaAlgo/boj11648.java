package BOJ.javaAlgo;

import java.io.*;

public class boj11648 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int count = 0;
        while ( Integer.parseInt(N) >= 10 ) {
            String[] num = N.split("");
            int sum = 1;
            for (String str : num) {
                sum *= Integer.parseInt(str);
            }
            N = String.valueOf(sum);
            count += 1;
        }
        sb.append(count);
        System.out.println(sb);
        br.close();
    }
}