import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= N - K; i++){
            int num = 0;
            for(int j = 0; j < K; j++){
                num += arr[i + j];
            }
            max = Math.max(num, max);
        }
        
        System.out.println(max);
        br.close();
    }
}