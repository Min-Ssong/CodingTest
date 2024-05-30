import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int  N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];
        for(int i = 0; i < N; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sIdx = 0;
        int eIdx = 0;
        long sum = numArr[sIdx];
        int count = 0;
        while(sIdx < N){
            if(sum == M) count += 1;
            if(sum >= M){
                sum -= numArr[sIdx++];
            } else {
                if(eIdx < N-1){
                    sum += numArr[++eIdx];
                } else {
                    break;
                }
            }
        }
        
        System.out.println(count);
        br.close();
    }
}