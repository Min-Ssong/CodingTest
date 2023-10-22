package programmers;
public class pr181871_0 {
    class Solution {
        public int solution(String myString, String pat) {
            int result = 0;
            int len = 0;
            while(true){
                int idx = myString.indexOf(pat, len);
                if(idx == -1){
                    return result;
                } else {
                    result++;
                    len = idx+1;
                }
            }
        }
    }
}
