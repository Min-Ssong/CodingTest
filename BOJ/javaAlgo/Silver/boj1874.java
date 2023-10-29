package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

// 231026 CT BOJ S2 1874:스택 수열
public class boj1874 {
    public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<Integer>();
            
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++){
                int num = Integer.parseInt(br.readLine());
                if(!stack.isEmpty()){
                    if(stack.peek() < num){
                        for(int j = count + 1; j <= num; j++){
                            stack.push(j);
                            sb.append("+").append("\n");
                        }
                        count = num;
                        
                        stack.pop();
                        sb.append("-").append("\n");
                    }
                    
                    if(stack.peek() >= num){
                        if(stack.peek() != num){
                            sb.setLength(0);
                            sb.append("NO");
                            break;
                        }
                        
                        for(int j = stack.peek(); j >= num; j--){
                            stack.pop();
                            sb.append("-").append("\n");
                        }
                    }
                } else{
                    for(int j = count + 1; j <= num; j++){
                        stack.push(j);
                        sb.append("+").append("\n");
                    }
                    count = num;
                    
                    stack.pop();
                    sb.append("-").append("\n");
                }
            }
            System.out.println(sb.toString());
            br.close();
        }
    }
}
