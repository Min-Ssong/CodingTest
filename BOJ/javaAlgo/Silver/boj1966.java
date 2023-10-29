package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

//231025 CT BOJ S3 1966:프린터큐
public class boj1966 {
    public class Main{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            Queue<Integer> numQueue = new LinkedList<Integer>();
            Queue<Integer> mQueue   = new LinkedList<Integer>();
            
            int T = Integer.parseInt(br.readLine());
            for(int i= 0; i < T; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                
                int max = Integer.MIN_VALUE;
                String[] nums = br.readLine().split(" ");
                for(int j = 0; j < N; j++){
                    int num = Integer.parseInt(nums[j]);
                    
                    numQueue.offer(num);
                    mQueue.offer(j == M ? 1 :0);
                    max = num > max ? num : max;
                }
                
                int count = 1;
                while(!numQueue.isEmpty()){
                    if(numQueue.peek() != max){
                        numQueue.offer(numQueue.poll());
                        mQueue.offer(mQueue.poll());
                    } else {
                        if(mQueue.peek() == 1) break;
                        
                        count += 1;
                        numQueue.poll();
                        mQueue.poll();
                        
                        max = Integer.MIN_VALUE;
                        for(int j = 0; j < numQueue.size(); j++){
                            int num = numQueue.poll();
                            
                            numQueue.offer(num);
                            max = num > max ? num : max;
                        }
                    }
                }
                sb.append(count).append("\n");
                numQueue.clear();
                mQueue.clear();
            }
            System.out.println(sb.toString());
        }
    }
}
