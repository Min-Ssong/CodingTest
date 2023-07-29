import java.util.ArrayList;
import java.util.Collections;

public class pr181909 {
    class Solution {
        public String[] solution(String my_string) {
            ArrayList<String> arr = new ArrayList<String>();
            String temp = "";
            for(int i = my_string.length() - 1; i >= 0; i--){
                temp = my_string.substring(i, my_string.length());
                arr.add(temp);
            }

            Collections.sort(arr);
            return arr.toArray(new String[0]);
        }
    }
}
