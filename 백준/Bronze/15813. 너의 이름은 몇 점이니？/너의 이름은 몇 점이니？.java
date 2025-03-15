import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Map<Character, Integer> nameScoreMap = new HashMap<Character, Integer>();        
        for(int i = 1; i <= 26; i++ ){
            nameScoreMap.put((char)(64+i), i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] name = br.readLine().toCharArray();
        int nameScore = 0;
        for (char c : name) {
            if( nameScoreMap.containsKey(c) ){
                nameScore += nameScoreMap.get(c);
            }
        }
        System.out.println(nameScore);
    }
}