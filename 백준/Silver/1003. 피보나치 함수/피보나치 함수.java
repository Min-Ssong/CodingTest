import java.io.*;
import java.util.*;

public class Main{
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            fibo(num);
            sb.append(dp[num][0] +" "+ dp[num][1]).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
    
    public static Integer[] fibo(int n){
        if(dp[n][0] == null || dp[n][1] == null){
            dp[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
            dp[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
        }
        return dp[n];
    }
}