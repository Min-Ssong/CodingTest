import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] words = br.readLine().toUpperCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        int max = -1;
        char result = '?';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == max){
                result = '?';
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
