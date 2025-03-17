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
            if( map.containsKey(word) ){
                int count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        
        int max = 0;
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
