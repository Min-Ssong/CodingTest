package programmers.none;

import java.io.*;
import java.util.StringTokenizer;

public class pr31 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for ( int i = 0; i < b; i++ ) {
            sb.append("*".repeat(a)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
