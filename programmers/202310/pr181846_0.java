package programmers;
import java.math.BigInteger;

public class pr181846_0 {
    class Solution {
        public String solution(String a, String b) {
            return new BigInteger(a).add(new BigInteger(b)).toString();
        }
    }
}
