import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            
            if("push_front".equals(order)){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if("push_back".equals(order)){
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if("pop_front".equals(order)){
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
            } else if("pop_back".equals(order)){
                sb.append(deque.isEmpty() ? -1 : deque.pollLast());
            } else if("size".equals(order)){
                sb.append(deque.size());
            } else if("empty".equals(order)){
                sb.append(deque.isEmpty() ? 1 : 0);
            } else if("front".equals(order)){
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst());
            } else if("back".equals(order)){
                sb.append(deque.isEmpty() ? -1 : deque.peekLast());
            }
            
            if(!"push_front".equals(order) && !"push_back".equals(order)) sb.append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }
}