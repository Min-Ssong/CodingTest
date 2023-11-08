import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        
        for(int i= 0; i < N; i++){
            String a = br.readLine().trim();
            if(!a.equals("0")){
                StringTokenizer st = new StringTokenizer(a);
                int len = Integer.parseInt(st.nextToken());
                for(int j = 0; j < len; j++){
                    queue.add(Integer.parseInt(st.nextToken()));
                }
            } else {
                sb.append(!queue.isEmpty() ? queue.poll().toString() : -1).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}