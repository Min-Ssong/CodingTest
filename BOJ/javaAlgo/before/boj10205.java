package BOJ.javaAlgo.before;

import java.io.*;

public class boj10205 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        for ( int i = 0; i < K; i++ ) {
            sb.append("Data Set "+(i+1)+":\n");
            int head = Integer.parseInt(br.readLine());
            String behaviors = br.readLine();
            for (String str : behaviors.split("")) {
                if ( head != 0 ) {
                    head += str.equals("b") ? -1 : 1;
                } else {
                    break;
                }
            }
            sb.append((head == 0) ? 0 : head);
            sb.append("\n\n");
        }
        System.out.print(sb);
        br.close();
    }
}
