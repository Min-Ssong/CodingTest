import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][M + 1];
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sum = new int[N + 1][M + 1];
        for(int i = 1; i <= M; i++){
            for(int j = 1; j <= N; j++){
                sum[j][i] = sum[M - j][i+j - N] + arr[j][i];
            }
        }

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        for(int loop = 0; loop < K; loop++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            i = ( i - 1 == 0 ) ? N : i - 1;
            j = j - 1;

            sb.append(sum[x][y] - sum[i][j]).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}