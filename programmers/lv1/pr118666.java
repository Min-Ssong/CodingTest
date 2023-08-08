package programmers.lv1;

import java.util.HashMap;

public class pr118666 {
    class Solution {
        public String solution(String[] survey, int[] choices) {
            HashMap<String, Integer> surveyMap = new HashMap<String, Integer>();
            surveyMap.put("R", 0);
            surveyMap.put("T", 0);
            surveyMap.put("F", 0);
            surveyMap.put("C", 0);
            surveyMap.put("M", 0);
            surveyMap.put("J", 0);
            surveyMap.put("A", 0);
            surveyMap.put("N", 0);
            
            // map에 점수 부여
            for(int i = 0; i < survey.length; i++){
                String notChar = survey[i].split("")[0];
                String goodChar = survey[i].split("")[1];
                int choice = choices[i];
                
                if(choice < 4){
                    surveyMap.put(notChar, surveyMap.get(notChar) + 4 - choice);
                } else if(choice > 4){
                    surveyMap.put(goodChar, surveyMap.get(goodChar) + choice - 4);
                }
            }
            
            String result = "";
            result += surveyMap.get("R") >= surveyMap.get("T") ? "R" : "T";
            result += surveyMap.get("C") >= surveyMap.get("F") ? "C" : "F";
            result += surveyMap.get("J") >= surveyMap.get("M") ? "J" : "M";
            result += surveyMap.get("A") >= surveyMap.get("N") ? "A" : "N";
            return result;
        }
    }
}