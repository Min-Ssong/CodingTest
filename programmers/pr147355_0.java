package programmers;
import java.math.BigInteger;

public class pr147355_0 {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            for(int i = 0; i <= t.length() - p.length(); i++){
                BigInteger bi = new BigInteger(t.substring(i, i+p.length()));
                if(new BigInteger(p).compareTo(bi) != -1){
                    answer += 1;
                }
            }
            return answer;
        }
    }
}