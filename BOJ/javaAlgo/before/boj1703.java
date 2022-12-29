package BOJ.javaAlgo.before;

import java.io.*;
import java.util.StringTokenizer;

public class boj1703 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
                
            int tree = 1;
            
            if(N == 0) {
                System.out.print(result);
                break;
            }
            
            for(int i = 0; i < 2 * N; i++) {
                int M = Integer.parseInt(st.nextToken());
                if(i % 2 == 0) {
                    tree *= M;
                }else {
                    tree -= M;
                }
            }
            result += tree + "\n";
        }
        br.close();
    }
}
