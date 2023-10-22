package programmers;
public class pr181893_0 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            int startIdx = 0;
            int endIdx = arr.length;
    
            for (int i = 0; i < query.length; i++) {
                int cutIdx = query[i];
    
                if (i % 2 == 0) {
                    endIdx = startIdx + cutIdx + 1;
                } else {
                    startIdx += cutIdx;
                }
            }
            
            int[] result = new int[endIdx - startIdx];
            System.arraycopy(arr, startIdx, result, 0, endIdx - startIdx);
    
            return result;
        }
    }    
}
