import java.util.ArrayList;
import java.util.Arrays;

public class pr181886 {

class Solution {
    public String[] solution(String[] names) {
            ArrayList<String> result = new ArrayList<String>(Arrays.asList(names[0]));
            for(int i = 5; i < names.length; i+=5){
                result.add(names[i]);
            }
            String[] answer = new String[result.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}
