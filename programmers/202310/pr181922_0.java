package programmers;
public class pr181922_0 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for(int i = 0; i < queries.length; i++){
                for(int j = queries[i][0]; j <= queries[i][1]; j++){
                    arr[j] = j % queries[i][2] == 0 ? arr[j]+=1 : arr[j];
                }
            }
            return arr;
        }
    }
}
