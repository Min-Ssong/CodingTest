package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

// 230914 CT PR 1 42840 : 모의고사
public class pr42840 {
	public static void main(String[] args) throws Exception{
		solution(new int[]{1,2,3,4,5});
		solution(new int[]{1,3,2,4,2});
		solution(new int[]{2,1,5,3,1,4,2,1,5,6,3,2,1,4,5});
	}
	
	public static int[] solution(int[] answers){		
		int[] firGiveUpMan = {1,2,3,4,5};
		int[] secGiveUpMan = {2,1,2,3,2,4,2,5};
		int[] thrGiveUpMan = {3,3,1,1,2,2,4,4,5,5};
		int[] count = {0,0,0};
		
		for(int i = 0; i < answers.length; i++){
			if(answers[i] == firGiveUpMan[i%5]) count[0]++;
			if(answers[i] == secGiveUpMan[i%8]) count[1]++;
			if(answers[i] == thrGiveUpMan[i%10]) count[2]++;
		}
		
		int max = Math.max(count[0], Math.max(count[1], count[2]));
		List<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < count.length; i++) if(max == count[i]) temp.add(i+1);
		
		int[] answer = new int[temp.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = temp.get(i);
		}
		return answer;
	}
}