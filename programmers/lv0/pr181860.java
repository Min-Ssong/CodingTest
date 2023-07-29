import java.util.Stack;

public class pr181860 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            Stack<Integer> st = new Stack<Integer>();
            for(int i = 0; i < flag.length; i++){
                if(flag[i]){
                    for(int j = 0; j < arr[i] * 2; j++){
                        st.push(arr[i]);
                    }
                } else {
                    for(int j = 0; j < arr[i]; j++){
                        st.pop();
                    }
                }
            }
            
            int[] answer = new int[st.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = st.get(i);
            }
            return answer;
        }
    }
}
