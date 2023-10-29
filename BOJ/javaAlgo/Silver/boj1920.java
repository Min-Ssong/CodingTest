package BOJ.javaAlgo.Silver;

import java.io.*;
import java.util.*;

// 231026 CT BOJ S4 1920:수 찾기
public class boj1920 {
    public class Main{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            
            int N = Integer.parseInt(br.readLine());
            int[] firArr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                firArr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(firArr);
            
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++){
                sb.append(Arrays.binarySearch(firArr, Integer.parseInt(st.nextToken())) >= 0 ? 1 : 0).append("\n");
            }
            
            System.out.println(sb.toString());
            br.close();
            
        }
    }
}
