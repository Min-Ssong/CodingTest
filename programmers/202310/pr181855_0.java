package programmers;
public class pr181855_0 {
    class Solution {
        public int solution(String[] strArr) {
            int[] intArr = new int[30];
            for(int i = 0; i < strArr.length; i++){
                intArr[strArr[i].length()]++;
            }
            
            int result = 0;
            for(int i = 0; i < intArr.length; i++){
                result = Math.max(result, intArr[i]);
            }
            return result;
        }
    }
}