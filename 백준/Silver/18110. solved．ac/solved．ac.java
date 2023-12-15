import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            diff[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(diff);
        for(int i = 0; i < Math.round(n * 0.15); i++){
            diff[i] = 0;
            diff[diff.length - 1 - i] = 0;
        }
        
        double sum = 0;
        double len = 0;
        for(int i = 0; i < diff.length; i++){
            sum += diff[i];
            len += diff[i] != 0 ? 1 : 0;
        }
        
        System.out.println(Math.round(sum / len));
        br.close();
    }
}