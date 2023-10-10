package programmers;
import java.util.HashSet;
import java.util.Set;

public class pr181900_0 {
    class Solution {
        public String solution(String my_string, int[] indices) {
            StringBuilder result = new StringBuilder();
            Set<Integer> indexSet = new HashSet<>();
            for(int index : indices) {
                indexSet.add(index);
            }
            for(int i = 0; i < my_string.length(); i++){
                if(!indexSet.contains(i)) {
                    result.append(my_string.charAt(i));
                }
            }
            return result.toString();
        }
    }
}