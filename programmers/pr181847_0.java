package programmers;
public class pr181847_0 {
    class Solution {
        public String solution(String n_str) {
            int idx = 0;
            String[] n_strArr = n_str.split("");
            for(int i = 0; i < n_strArr.length; i++){
                if(n_strArr[i].matches("[1-9]")){
                    idx = i;
                    break;
                }
            }

            return n_str.substring(idx);
            //return ""+Integer.parseInt(n_str);
        }
    }
}
