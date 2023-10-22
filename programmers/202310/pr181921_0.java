package programmers;
import java.util.ArrayList;

public class pr181921_0 {
    class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = l; i <= r; i++){
			if(Integer.toString(i).matches("[05]+")){
				temp.add(i);
			}
		}
		
		int[] answer = new int[temp.size()];
		if(answer.length == 0){
			return new int[]{-1};
		} else {
			for(int i = 0; i < temp.size(); i++){
				answer[i] = temp.get(i);
			}
		}
        return answer;
    }
}
}
