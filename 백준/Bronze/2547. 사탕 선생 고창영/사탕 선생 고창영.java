import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            br.readLine();
            
            int person = Integer.parseInt(br.readLine());
            BigInteger candys = BigInteger.ZERO;
            for(int j = 0; j < person; j++){
                candys = candys.add(new BigInteger(br.readLine()));
            }
            
            if(!sb.toString().equals("")){
                sb.append("\n");
            }
            
            if(!candys.remainder(BigInteger.valueOf(person)).equals(BigInteger.ZERO)){
                sb.append("NO");
            } else {
                sb.append("YES");
            }
        }
        
        System.out.println(sb.toString());
    }
}