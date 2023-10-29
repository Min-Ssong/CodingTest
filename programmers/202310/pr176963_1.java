package programmers;

import java.util.HashMap;

public class pr176963_1 {
    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            HashMap<String, Integer> memory = new HashMap<String, Integer>();
            for(int i = 0; i < name.length; i++){
                memory.put(name[i], yearning[i]);
            }
            
            int[] answer = new int[photo.length];
            for(int i = 0; i < photo.length; i++){
                for(int j = 0; j < photo[i].length; j++){
                    if(memory.containsKey(photo[i][j])){
                        answer[i] += memory.get(photo[i][j]);
                    }
                }
            }
            return answer;
        }
    }
}
