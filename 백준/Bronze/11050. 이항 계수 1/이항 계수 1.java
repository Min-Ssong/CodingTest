import java.io.*;
import java.util.*;

public class Main{
    static int N, K = 0;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];
        
        int DP = DP(N, K);
        System.out.println(DP);
        br.close();
    }
    public static int DP(int a, int b){
        if(a == b || b == 0) return dp[a][b] = 1;
        return dp[a][b]= DP(a - 1, b - 1) +DP(a - 1, b);
    }
}