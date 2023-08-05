import java.util.ArrayList;

public class pr181918 {
    class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++){
                if(temp.size() != 0 && temp.get(temp.size() - 1) >= arr[i]){
                    temp.remove(temp.size() - 1);
                }
                
                if(temp.size() == 0){
                    temp.add(arr[i]);
                } else if(temp.size() != 0 && temp.get(temp.size() - 1) < arr[i]){
                    temp.add(arr[i]);
                }
            }
            
            int[] result = new int[temp.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = temp.get(i);
            }
            return result;
        }
    }
}
