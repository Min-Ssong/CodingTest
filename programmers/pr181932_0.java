package programmers;
public class pr181932_0 {
    class Solution {
        public String solution(String code) {
            StringBuilder ret = new StringBuilder();
            int mode = 0;
    
            for (int i = 0; i < code.length(); i++) {
                char currentChar = code.charAt(i);
    
                if (currentChar == '1') {
                    mode ^= 1;
                } else {
                    if (mode == 0 && i % 2 == 0) {
                        ret.append(currentChar);
                    } else if (mode == 1 && i % 2 != 0) {
                        ret.append(currentChar);
                    }
                }
            }
    
            return ret.length() == 0 ? "EMPTY" : ret.toString();
        }
    }    
}