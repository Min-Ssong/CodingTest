package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

// 230918 CT BOJ S5 11866:요세푸스 문제 0
public class boj11866{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i= 1; i <= N; i++) que.offer(i);
        
        sb.append("<");
        while(que.size() != 1){
            for(int i = 0; i < K; i++){
                if(i == (K- 1)){
                    sb.append(que.poll()).append(", ");
                    continue;
                }
                
                que.offer(que.poll());
            }
        }
        System.out.println(sb.append(que.poll()).append(">").toString());
    }
}
