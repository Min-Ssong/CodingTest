package BOJ.javaAlgo.B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5086 {
    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            while(true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                if(num1 == 0 && num2 == 0) break;
                int min = Math.min(num1, num2);
                int max = Math.max(num1, num2);
                
                String msg = max % min != 0 ? "neither" : "";
                if("".equals(msg)){
                    msg = min == num1 ? "factor" : "multiple";
                }
                sb.append(msg).append("\n");
            }
            System.out.print(sb);
        }
    }
}
