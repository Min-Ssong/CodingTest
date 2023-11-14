import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        for ( int i = 0; i < b; i++ ) {
            sb.append("*".repeat(a)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}