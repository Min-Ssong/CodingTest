public class pr181857 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            for(int i = 0; i <= 10; i++){
                int pow = (int)Math.pow(2, i);
                if(arr.length < pow){
                    answer = new int[pow];
                    System.arraycopy(arr, 0, answer, 0, arr.length);
                    break;
                } else if(arr.length == pow){
                    return arr;
                }
            }
            return answer;
        }
    }
}
