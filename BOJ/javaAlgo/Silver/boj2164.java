package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

// 230918 CT BOJ S4 2164:카드2
public class boj2164{
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que= new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) que.offer(i);
        
        while(que.size() != 1){
            que.poll();
            int num= que.peek();
            que.poll();
            que.offer(num);
        }
        System.out.println(que.peek());
    }
}