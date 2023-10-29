import java.io.*;
import java.util.*;

// 230918 CT BOJ S4 18258:큐2
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue= new LinkedList<Integer>();
        int num= -1;
        for(int i= 0; i < N; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch(order){
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.offer(num);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : num).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}