import java.util.HashSet;
import java.util.Set;

public class pr1845 {
    class Solution {
        public int solution(int[] nums) {
            int full=nums.length/2;
            Set<Integer> a = new HashSet<>();
            for(int num : nums){
                a.add(num);
            }
            return a.size() >= full ? full : a.size();
        }
    }
}
