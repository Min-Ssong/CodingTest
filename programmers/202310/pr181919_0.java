package programmers;
import java.util.ArrayList;
import java.util.Arrays;

public class pr181919_0 {
    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(n));
            while(n != 1){
                n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
                arr.add(n);
            }
            
            int[] answer = new int[arr.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr.get(i);
            }
            
            return answer;
        }
    }
}
