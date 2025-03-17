import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer numSt = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(numSt.nextToken());
        int M = Integer.parseInt(numSt.nextToken());

        Set<String> heard = new HashSet<>();
        for(int i = 0; i < N; i++){
            heard.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if( heard.contains(name) ){
                result.add(name);
            }
        }

        Collections.sort(result);
        bw.write(result.size() + "\n");
        bw.write(String.join("\n", result));
        bw.flush();
    }
}