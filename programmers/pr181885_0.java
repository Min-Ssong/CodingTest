package programmers;
import java.util.ArrayList;

public class pr181885_0 {
    class Solution {
        public String[] solution(String[] todo_list, boolean[] finished) {
            ArrayList<String> result = new ArrayList<String>();
            for(int i = 0; i < finished.length; i++){
                if(!finished[i]){
                    result.add(todo_list[i]);
                }
            }
            String[] answer = new String[result.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}