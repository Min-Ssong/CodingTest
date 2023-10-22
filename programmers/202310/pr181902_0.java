package programmers;
public class pr181902_0 {
    class Solution {
        public int[] solution(String my_string) {
            int[] result = new int[52];	
            for(char ch : my_string.toCharArray()){
                int chInt = (int)ch <= 90 ? (int)ch - 65 : (int)ch - 71;			
                result[chInt]++;
            }
            return result;
        }
    }
}
