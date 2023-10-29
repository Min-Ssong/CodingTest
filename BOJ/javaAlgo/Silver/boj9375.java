import java.io.*;
import java.util.*;
import java.util.Map.Entry;

// 231019 CT BOJ S3 9375:패션왕 신해빈
public class boj9375{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> wearMap = new HashMap<String, Integer>();
        
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n= Integer.parseInt(br.readLine());
            
            if(n == 0){
                sb.append(0).append("\n");
            } else {
                for(int j = 0; j < n; j++){
                    String key = br.readLine().split(" ")[1];
                    wearMap.put(key, wearMap.getOrDefault(key, 0) + 1);
                }
            
                int answer = 1;
                for(Entry<String, Integer> entry : wearMap.entrySet()){
                    int value = entry.getValue();
                    answer *= value + 1;
                }
                sb.append(answer - 1).append("\n");
                wearMap.clear();
            }
        }
        
        System.out.println(sb.toString());
    }
}