public class pr120924 {
    class Solution {
        public int solution(int[] common) {
            int num = 0;
            if(common[1] - common[0] == common[2] - common[1]){
                num = common[1] - common[0];
                return common[common.length-1] + num;
            } else {
                num = common[1] / common[0];
                return common[common.length-1] * num;
            }
        }
    }
}
