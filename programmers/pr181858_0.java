package programmers;
import java.util.ArrayList;

public class pr181858_0 {
    class Solution {
        public int[] solution(int[] arr, int k) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(arr[0]);
            for(int i = 1; i < arr.length; i++){
                if(!temp.contains(arr[i]) && temp.size() < k){
                    temp.add(arr[i]);
                }
            }
    
            if(temp.size() < k){
                for(int i = temp.size(); i < k; i++){
                    temp.add(-1);
                }
            }
    
            int[] answer = new int[temp.size()];
            for(int i = 0 ; i < answer.length; i++){
                answer[i] = temp.get(i);
            }
            
            return answer;
        }
    }
}
