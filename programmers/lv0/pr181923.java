import java.util.ArrayList;

public class pr181923 {
    class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < queries.length; i++){
			int min = Integer.MAX_VALUE;
			for(int j = queries[i][0]; j <= queries[i][1]; j++){
				if(arr[j] > queries[i][2] && arr[j] < min){
					min = arr[j];
				}
			}
			temp.add(min == Integer.MAX_VALUE ? -1 : min);
		}
		
		int[] result = new int[temp.size()];
		for(int i = 0; i < temp.size(); i++){
			result[i] = temp.get(i);
		}
		return result;
    }
}