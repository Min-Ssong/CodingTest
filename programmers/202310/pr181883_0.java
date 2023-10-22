package programmers;
public class pr181883_0 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for(int i = 0; i < queries.length; i++){
                int startNum = queries[i][0];
                int endNum   = queries[i][1];
                for(int j = startNum; j <= endNum; j++){
                    arr[j]++;
                }
            }
            return arr;
        }
    }
}
