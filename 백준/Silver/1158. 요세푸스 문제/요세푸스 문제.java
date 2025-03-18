import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 1; i <= N; i++){
            deque.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while ( !deque.isEmpty() ) {
            for(int i = 0; i < K - 1; i++){
                deque.addLast(deque.pollFirst());
            }
            sb.append(deque.poll() + ", ");
        }
        sb.append(">");
        sb.delete(sb.length()-3, sb.length()-1);
        System.out.println(sb);
    }
}
