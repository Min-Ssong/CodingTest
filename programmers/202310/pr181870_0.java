package programmers;
import java.util.ArrayList;

public class pr181870_0 {
    class Solution {
        public String[] solution(String[] strArr) {
            ArrayList<String> arr = new ArrayList<String>();
            for(int i = 0; i < strArr.length; i++){
                if(strArr[i].indexOf("ad") == -1) arr.add(strArr[i]);
            }
            
            String[] answer = new String[arr.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr.get(i);
            }
            return answer;
        }
    }
}
