package programmers.lv0;

public class pr181934 {
    class Solution {
        public int solution(String ineq, String eq, int n, int m) {
            boolean resultTF = true;
            if("<".equals(ineq)){
                resultTF = ("=".equals(eq)) ? n <= m : n < m;
            } else {
                resultTF = ("=".equals(eq)) ? n >= m : n > m;
            }
            return resultTF ? 1 : 0;
        }
    }
}
