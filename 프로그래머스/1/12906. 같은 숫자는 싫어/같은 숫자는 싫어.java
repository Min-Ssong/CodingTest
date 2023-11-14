import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        int num = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            int num2 = arr[i];
            if ( num != num2 ) {
                num = num2;
                temp.add(num2);
            }
        }
        int[] answer = new int[temp.size()];
        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}