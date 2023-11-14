import java.io.*;
import java.util.*;
class Solution{
	public static int solution(String[][] clothes){
		int answer = 1;
        Map<String, Integer> wearMap = new HashMap<String, Integer>();
		for(int i = 0; i < clothes.length; i++){
			wearMap.put(clothes[i][1], !wearMap.containsKey(clothes[i][1]) ? 1 : wearMap.get(clothes[i][1]) + 1);
        }
		for(Map.Entry<String, Integer> ent : wearMap.entrySet())
            answer *= ent.getValue() + 1;
        
		return answer - 1;
	}
}