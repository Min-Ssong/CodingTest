import java.util.HashSet;
import java.util.Set;

public class pr120876 {
    class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            Set<Integer> lineSet = new HashSet<Integer>();
            for(int i = 0; i < lines.length; i++){
                int start = lines[i][0];
                int end   = lines[i][1];
                
                for(int j = start; j < end; j++){
                    if(!lineSet.add(j)){
                        answer += 1;
                        lineSet.remove(j);
                    }
                }
            }
            return answer;
        }
    }
}
