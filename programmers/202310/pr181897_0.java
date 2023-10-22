package programmers;
import java.util.ArrayList;
public class pr181897_0 {
    class Solution {
        public int[] solution(int n, int[] slicer, int[] num_list) {
            ArrayList<Integer> temp = new ArrayList<>();
            if(n == 1){
                for(int i = 0; i <= slicer[1]; i++){
                    temp.add(num_list[i]);
                }
            } else if(n == 2){
                for(int i = slicer[0]; i < num_list.length; i++){
                    temp.add(num_list[i]);
                }
            } else if(n == 3){
                for(int i = slicer[0]; i <= slicer[1]; i++){
                    temp.add(num_list[i]);
                }
            } else {
                for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]){
                    temp.add(num_list[i]);
                }
            }

            int[] answer = new int[temp.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = temp.get(i);
            }
            return answer;
        }
    }
}
