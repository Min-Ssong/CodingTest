package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

public class boj10828 {
    public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Stack<Integer> stack = new Stack<Integer>();
            StringBuilder sb = new StringBuilder();
            int N= Integer.parseInt(br.readLine());
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch(st.nextToken()){
                    case "push"  : stack.push(Integer.parseInt(st.nextToken()));             break;
                    case "pop"   : sb.append(stack.empty() ? -1 : stack.pop()).append("\n"); break;
                    case "size"  : sb.append(stack.size()).append("\n");                     break;
                    case "empty" : sb.append(stack.empty() ? 1 : 0).append("\n");            break;
                    case "top"   : sb.append(stack.empty() ? -1 : stack.peek()).append("\n");break;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
