import java.util.Arrays;

public class pr181866 {
    class Solution {
        public String[] solution(String myString) {
            String[] splitted = myString.split("x");
    
            // 빈 문자열은 반환하지 않으므로, 빈 문자열이 있는 경우 제거해야 함.
            String[] result = Arrays.stream(splitted)
                                    .filter(s -> !s.isEmpty())
                                    .toArray(String[]::new);
    
            Arrays.sort(result);
            return result;
        }
    }
}
