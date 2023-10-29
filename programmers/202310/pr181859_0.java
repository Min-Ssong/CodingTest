package programmers;
import java.util.ArrayList;

public class pr181859_0 {
    class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> stk = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++){
                if(stk.size() == 0){
                    stk.add(arr[i]);
                } else {
                    if(stk.get(stk.size() - 1) == arr[i]){
                        stk.remove(stk.size() - 1);
                    } else {
                        stk.add(arr[i]);
                    }
                }
            }
            
            int[] result = new int[stk.size()];
            for(int i = 0; i < stk.size(); i++){
                result[i] = stk.get(i);
            }
            return result.length == 0 ? new int[]{ -1 } : result;
        }
    }
}
