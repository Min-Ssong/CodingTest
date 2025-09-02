import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int yPrice = 0;
        int mPrice = 0;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            yPrice += (num / 30 + 1) * 10;
            mPrice += (num / 60 + 1) * 15;
        }
        
        StringBuilder sb = new StringBuilder();
        if(yPrice == mPrice){
            sb.append("Y M ").append(yPrice);
        } else if(yPrice < mPrice){
            sb.append("Y ").append(yPrice);
        } else {
            sb.append("M ").append(mPrice);
        }
        System.out.println(sb.toString());
    }
}