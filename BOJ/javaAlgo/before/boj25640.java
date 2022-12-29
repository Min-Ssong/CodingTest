package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj25640 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myMBTI = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            count += ( myMBTI.equals(st.nextToken()) ) ? 1 : 0;
        }
        System.out.print(count);
        br.close();
    }
}