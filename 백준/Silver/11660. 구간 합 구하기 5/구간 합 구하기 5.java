import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] mainArray = new int[N+1][N+1];
        int[][] plusArray = new int[N+1][N+1];
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                mainArray[i][j] = Integer.parseInt(st.nextToken());
                plusArray[i][j] = mainArray[i][j];
                if(j != 0){
                    plusArray[i][j] += plusArray[i][j-1];
                }
            }
        }
        
        for(int i = 1; i <= M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = 0;
            
            if(x1 == x2 && y1 == y2){
                result = mainArray[x1][y1];
                sb.append(result).append("\n");
                continue;
            }
            
            for(int j = x1; j < x2 + 1; j++){
                result += plusArray[j][y2] - plusArray[j][y1-1];
            }
            
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}