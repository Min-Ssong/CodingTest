package programmers;
public class pr181833_0 {
    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            for(int i = 0; i < answer.length; i++){
                for(int j = 0; j < answer[i].length; j++){
                    answer[i][j] = i == j ? 1 : 0;
                }
            }
            return answer;
        }
    }
}
