import java.util.*;
public class Solution {
	public static void main(String[] args) throws Exception{
		solution("banana");
		solution("foobar");
	}
	
	public static int[] solution(String s){
		Set<String> set = new HashSet<String>();
		int[] answer = new int[s.length()];
		String[] splitStr = s.split("");
		for(int i = 0; i < splitStr.length; i++){
			String str = splitStr[i];
			if(!set.contains(str)){
				answer[i] = -1;
				set.add(str);
			} else {
				for(int j = i-1; j >= 0; j--){
					if(splitStr[i].equals(splitStr[j])){
						answer[i] = i - j;
						break;
					}
				}
			}
		}
		return answer;
	}
}