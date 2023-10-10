package programmers;
public class pr181837_0 {
    class Solution {
        public int solution(String[] order) {
            int result = 0;
            for(String str : order){
                result += str.indexOf("latte") != -1 ? 5000 : 4500;
            }
            return result;
        }
    }
}
