package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj11653 {
    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            if(N != 1){
                for(int i = 2; i * i <= N; i++){
                    while(N % i == 0){
                        sb.append(i).append("\n");
                        N /= i;
                    }
                }
                
                if(N > 1){
                    sb.append(N).append("\n");
                }
            }
            System.out.println(sb);
        }
    }
}
