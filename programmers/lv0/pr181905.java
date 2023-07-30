public class pr181905 {
    class Solution {
        public String solution(String my_string, int s, int e) {
            StringBuilder sb = new StringBuilder();
            sb.append(my_string.toCharArray(), 0, s);
            String[] temp = my_string.substring(s, e+1).split("");
            for(int i = temp.length-1; i >= 0; i--){
                sb.append(temp[i]);
            }
            sb.append(my_string.toCharArray(), e+1, my_string.length() - e - 1);
            return sb.toString();
        }
    }
}
