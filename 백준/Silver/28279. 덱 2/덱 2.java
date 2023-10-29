import java.io.*;
import java.util.*;

// 230921 CT BOJ S4 28279:덱2
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int X = 0;
            switch(order){
                case 1:
                    X = Integer.parseInt(st.nextToken());
                    deque.offerFirst(X);
                    break;
                case 2:
                    X = Integer.parseInt(st.nextToken());
                    deque.offerLast(X);
                    break;
                case 3:
                    X = -1;
                    if(!deque.isEmpty()){
                        X = deque.peekFirst();
                        deque.removeFirst();
                    }
                    sb.append(X).append("\n");
                    break;
                case 4:
                    X = -1;
                    if(!deque.isEmpty()){
                        X = deque.peekLast();
                        deque.removeLast();
                    }
                    sb.append(X).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(!deque.isEmpty() ? 0 : 1).append("\n");
                    break;
                case 7:
                    sb.append(!deque.isEmpty() ? deque.peekFirst() : -1).append("\n");
                    break;
                case 8:
                    sb.append(!deque.isEmpty() ? deque.peekLast() : -1).append("\n");
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}