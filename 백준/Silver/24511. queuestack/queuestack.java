import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] seqA = br.readLine().split(" ");
        String[] seqB = br.readLine().split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if( "0".equals(seqA[i])){
                deque.push(Integer.parseInt(seqB[i]));
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] seqC = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            deque.add(Integer.parseInt(seqC[i]));
            sb.append(deque.poll() + " ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
