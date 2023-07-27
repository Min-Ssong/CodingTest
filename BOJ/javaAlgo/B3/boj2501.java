package BOJ.javaAlgo.B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2501 {
    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());		
            
            ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1));
            int num = 2;
            while(num != N+1){
                if(N % num == 0){
                    arr.add(num);
                }
                num++;
            }
            
            if( N == K ){
                System.out.println(N);
            } else {			
                System.out.println((arr.size() > K - 1) ? arr.get(K - 1) : "0");
            }
        }
    }
}
