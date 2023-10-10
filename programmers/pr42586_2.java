package programmers;

import java.util.ArrayList;

public class pr42586_2 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int count= 0;
            int beforeNum = Math.abs(100 - progresses[0]) % speeds[0] != 0 ? Math.abs(100 - progresses[0]) / speeds[0] + 1 : Math.abs(100 - progresses[0]) / speeds[0];
            
            ArrayList<Integer> tempArr= new ArrayList<Integer>();
            for(int i = 0; i < progresses.length; i++){
                int afterNum = Math.abs(100 - progresses[i]) / speeds[i];
                int divNum= Math.abs(100 - progresses[i]) % speeds[i];
                afterNum = divNum != 0 ? afterNum + 1: afterNum;
                
                if(beforeNum < afterNum){
                    beforeNum = afterNum;
                    tempArr.add(count);
                    count = 1;
                } else {
                    count += 1;
                }
            }
            tempArr.add(count);
            
            int[] answer = new int[tempArr.size()];
            for(int i = 0; i < tempArr.size(); i++){
                answer[i]= tempArr.get(i);
            }
            
            return answer;
        }
    }
}
