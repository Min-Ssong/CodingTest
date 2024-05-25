import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] mainArray = new int[N];
        for(int i = 0; i < N; i++){
            mainArray[i] = Integer.parseInt(st.nextToken());
        }
        
        int startIdx = 0;
        int endIdx = 0;
        int sum = mainArray[endIdx];
        int count = Integer.MAX_VALUE;        
        while (endIdx < N) {
            if (sum >= S) {
                count = Math.min(count, endIdx - startIdx + 1);
            }

            if (sum < S) { 
                endIdx++;
                if (endIdx < N) {
                    sum += mainArray[endIdx];
                }
            } else {
                sum -= mainArray[startIdx];
                startIdx++;
            }
        }
        
        System.out.println(count == Integer.MAX_VALUE ? 0 : count);
        
        br.close();
    }
}