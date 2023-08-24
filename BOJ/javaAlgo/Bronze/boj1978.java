package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1978 {
    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int count = 0;
            for(int i = 0; i < N; i++){
                int num = Integer.parseInt(st.nextToken());
                if(num != 1){
                    String flag = "T";
                    for(int j = 2; j < num; j++){
                        if(num % j == 0){
                            flag = "F";
                            break;
                        }
                    }
                    count += "T".equals(flag) ? 1 : 0;
                }
            }
            System.out.println(count);
        }
    }
}
