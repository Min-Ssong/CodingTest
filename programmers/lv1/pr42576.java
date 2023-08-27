package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class pr42576 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String, Integer> tempMap = new HashMap<String, Integer>();
            for(String str : participant){
            if(tempMap.containsKey(str))
                tempMap.put(str, tempMap.get(str) + 1);
                else
                    tempMap.put(str,1);
                    
            }
            
            for(String str : completion){
                tempMap.put(str, tempMap.get(str) - 1);
                if(tempMap.get(str) == 0)
                    tempMap.remove(str);
            }
            String answer="";
            for(String key:tempMap.keySet())
                answer = key;
            return answer;
        }
    }
}
