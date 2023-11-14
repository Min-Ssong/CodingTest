import java.util.*;
public class Solution {
	public static void main(String[] args) throws Exception{
		solution(new int[]{6,10,2});
		solution(new int[]{3,30,34,5,9});
		solution(new int[]{1000,999,995,998,997});
	}
	
	public static String solution(int[] numbers){
        String[] temp = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++){
			temp[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(temp, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
		
		if(temp[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String str : temp)
            sb.append(str);
        return sb.toString();
	}
}