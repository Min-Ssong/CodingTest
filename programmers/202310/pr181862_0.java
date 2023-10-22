package programmers;
import java.util.Arrays;

public class pr181862_0 {
    class Solution {
        public String[] solution(String myStr) {
            String[] result = myStr.split("[abc]");
            result = Arrays.stream(result).filter(str -> !str.isEmpty()).toArray(String[]::new);
            return result.length == 0 ? new String[]{"EMPTY"} : result;
        }
    }
}
