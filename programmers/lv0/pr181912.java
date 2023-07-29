import java.util.ArrayList;

public class pr181912 {
    class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            ArrayList<String> arr = new ArrayList<String>();
            for(String str : intStrs){
                if(Integer.parseInt(str.substring(s, s+l)) > k){
                    arr.add(str.substring(s, s+l));
                }
            }
            
            int[] answer = new int[arr.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = Integer.parseInt(arr.get(i));
            }
            
            return answer;
        }
    }
}
