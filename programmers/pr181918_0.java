package programmers;
import java.util.Stack;
public class pr181918_0 {
    class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> stack = new Stack<>();
            int i = 0;
            
            while (i < arr.length) {
                if (stack.isEmpty() || stack.peek() < arr[i]) {
                    stack.push(arr[i]);
                    i += 1;
                } else {
                    stack.pop();
                }
            }
            
            int[] stk = new int[stack.size()];
            for (int j = 0; j < stk.length; j++) {
                stk[j] = stack.get(j);
            }

            return stk;
        }
    }
}
