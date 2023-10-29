import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            sb.append("Case #"+(i+1)+": ");
            if ( !(A + B > C && A + C > B && B + C > A) ) {
                sb.append("invalid!\n");
            } else {
                if ( A == B && B == C && A == C ) {
                    sb.append("equilateral\n");
                } else if ( A == B || B == C || A == C ) {
                    sb.append("isosceles\n");
                } else {
                    sb.append("scalene\n");
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
}
