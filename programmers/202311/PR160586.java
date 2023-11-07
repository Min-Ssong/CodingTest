import java.util.*;
public class PR160586 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for(int i = 0; i < keymap.length; i++){
                char[] keymapArr = keymap[i].toCharArray();
                for(int j = 0; j < keymapArr.length; j++){
                    char key = keymapArr[j];
                    if(map.containsKey(key)){
                        map.put(key, Math.min(map.get(key), j+1));
                    } else {
                        map.put(key, j+1);
                    }
                }
            }
            
            int[] answer = new int[targets.length];
            for(int i = 0; i < targets.length; i++){
                char[] targetArr = targets[i].toCharArray();
                for(int j = 0; j < targetArr.length; j++){
                    char key = targetArr[j];
                    if(!map.containsKey(key)){
                        answer[i] = -1;
                        break;
                    }
                    
                    answer[i] += map.get(key);
                }
            }
            return answer;
        }
    }
}