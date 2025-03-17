import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer numSt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(numSt.nextToken());
        int M = Integer.parseInt(numSt.nextToken());

        Set<String> set = new HashSet<>();
        int count = 0;
        List<String> overlap = new ArrayList<>();
        for(int i = 0; i < N + M; i++){
            String name = br.readLine();
            if( set.contains(name) ){
                overlap.add(name);
                count++;
            }

            set.add(name);
        }

        Collections.sort(overlap);
        
        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        for(int i = 0; i < overlap.size(); i++){
            if(i == overlap.size() - 1) {
                sb.append(overlap.get(i));
                break;
            }

            sb.append(overlap.get(i)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}