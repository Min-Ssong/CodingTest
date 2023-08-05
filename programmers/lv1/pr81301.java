package programmers.lv1;

import java.util.HashMap;

public class pr81301 {
    class Solution {
        public int solution(String s) {
            HashMap<String, String> nMap = new HashMap<String, String>();
            nMap.put("zero",  "0");
            nMap.put("one",   "1");
            nMap.put("two",   "2");
            nMap.put("three", "3");
            nMap.put("four",  "4");
            nMap.put("five",  "5");
            nMap.put("six",   "6");
            nMap.put("seven", "7");
            nMap.put("eight", "8");
            nMap.put("nine",  "9");
            
            String temp = "";
            String result = "";
            for(char ch : s.toCharArray()){
                if(Character.isDigit(ch)){
                    result += Character.toString(ch);
                } else {
                    temp += ch;
                    if(nMap.containsKey(temp)){
                        result += nMap.get(temp);
                        temp = "";
                    }
                }
            }
            return Integer.parseInt(result);
        }
    }
}
