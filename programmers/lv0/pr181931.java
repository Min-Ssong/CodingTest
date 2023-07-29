public class pr181931 {
    class Solution {
        public int solution(int a, int d, boolean[] included) {
            int[] answer = new int[included.length];
            answer[0] = a;
            for(int i = 1; i < answer.length; i++){
                answer[i] = answer[i-1] + d;
            }
            
            int result = 0;
            for(int i = 0; i < answer.length; i++){
                if(included[i]){
                    result += answer[i];
                }
            }
            return result;
        }
    }
}
