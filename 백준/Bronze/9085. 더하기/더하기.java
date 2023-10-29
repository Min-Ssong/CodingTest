import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int num = 0;
        for ( int i = 0; i < T; i++ ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < N; j++ ) {
                num += Integer.parseInt(st.nextToken());
            }
            sb.append(num).append("\n");
            num = 0;
        }
        System.out.print(sb);
        br.close();
    }
}