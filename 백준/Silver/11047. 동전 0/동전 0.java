import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] moneys = new Integer[N];
        for(int i = 0; i < N; i++){
            moneys[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(moneys, Collections.reverseOrder());

        int answer = 0;
        for(int i = 0; i < moneys.length; i++){
            answer += K / moneys[i];
            K %= moneys[i];
        }
        System.out.println(answer);
    }
}
