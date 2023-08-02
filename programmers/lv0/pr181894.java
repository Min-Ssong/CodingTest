import java.util.ArrayList;
import java.util.Arrays;

public class pr181894 {
    class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 2){
                    temp.add(i);
                }
            }
    
            if(temp.size() == 0){
                return new int[]{ -1 };
            } else {
                int[] answer = new int[temp.get(temp.size() - 1)];
                answer = Arrays.copyOfRange(arr, temp.get(0), temp.get(temp.size() - 1) + 1);
                
                return answer;
            }
        }
    }
}
