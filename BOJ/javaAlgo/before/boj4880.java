package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj4880 {
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while ( true ) {
            String apgp = br.readLine();
            if ( apgp.equals("0 0 0") ) {
                System.out.print(sb);
                break;
            }

            StringTokenizer st = new StringTokenizer(apgp);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if ( C - B == B - A ) {
                sb.append("AP ").append(String.valueOf((C-B) + C)).append("\n");
            } else if ( C / B == B / A ) {
                sb.append("GP ").append(String.valueOf((C/B) * C)).append("\n");
            }
        }
        br.close();
    }
}
