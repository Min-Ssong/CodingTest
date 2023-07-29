import java.util.ArrayList;

public class pr181867 {
    class Solution {
        public int[] solution(String myString) {
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(char str : myString.toCharArray()){
                if(str == 'x'){
                    arr.add(count);
                    count = 0;
                } else {
                    count++;
                }
            }
            arr.add(count);
            
            int[] answer = new int[arr.size()];		
            for (int i = 0; i < arr.size(); i++) {
                answer[i] = arr.get(i);
            }

            return answer;
        }
    }
}
