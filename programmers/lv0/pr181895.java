package programmers.lv0;

public class pr181895 {
    class Solution {
        public int[] solution(int[] arr, int[][] intervals) {        
            int[] firstInterval = new int[intervals[0][1] - intervals[0][0] + 1];
            int[] secondInterval = new int[intervals[1][1] - intervals[1][0] + 1];
            
            System.arraycopy(arr, intervals[0][0], firstInterval, 0, firstInterval.length);
            System.arraycopy(arr, intervals[1][0], secondInterval, 0, secondInterval.length);
            
            int[] result = new int[firstInterval.length + secondInterval.length];
            
            System.arraycopy(firstInterval, 0, result, 0, firstInterval.length);
            System.arraycopy(secondInterval, 0, result, firstInterval.length, secondInterval.length);
            
            return result;
        }
    }
}
