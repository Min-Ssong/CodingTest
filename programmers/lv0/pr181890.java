import java.util.Arrays;

public class pr181890 {
    class Solution {
        public String[] solution(String[] str_list) {
            String[] result = {};
            for(int i = 0; i < str_list.length; i++){
                if("l".equals(str_list[i])){
                    result = Arrays.copyOfRange(str_list, 0, i);
                    break;
                } else if("r".equals(str_list[i])){
                    result = Arrays.copyOfRange(str_list, i+1, str_list.length);
                    break;
                }
            }
            
            return result;
        }
    }
}
