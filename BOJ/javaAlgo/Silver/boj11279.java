package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

// 231025 CT BOJ S2 11279:최대 힙
public class boj11279 {
    public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            PriorityQueue<Integer> preQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
            
            int N = Integer.parseInt(br.readLine());
            for(int i = 0; i < N; i++){
                int num = Integer.parseInt(br.readLine());
                if(num == 0){
                    sb.append(preQueue.isEmpty() ? 0 : preQueue.poll()).append("\n");
                } else {
                    preQueue.offer(num);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
