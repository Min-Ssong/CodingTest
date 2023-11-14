import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> termMap = new HashMap<String, Integer>();
        for(int i = 0; i < terms.length; i++){
            String key = terms[i].split(" ")[0];
            int value = Integer.parseInt(terms[i].split(" ")[1]);
            termMap.put(key, value);
        }

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < privacies.length; i++){
            String privacie = privacies[i].split(" ")[0];
            String userTerm = privacies[i].split(" ")[1];
            int userYear = Integer.parseInt(privacie.split("\\.")[0]);
            int userMonth = Integer.parseInt(privacie.split("\\.")[1]);
            int userDay = Integer.parseInt(privacie.split("\\.")[2]);

            if(termMap.containsKey(userTerm)){
                userDay--;
                userMonth += termMap.get(userTerm);
                
                if(userDay <= 0){
                    userMonth--;
                    userDay = 28;
                }

                while(userMonth >= 13){
                    userMonth -= 12;
                    userYear += 1;
                }
            }

            int todayYear = Integer.parseInt(today.split("\\.")[0]);
            int todayMonth = Integer.parseInt(today.split("\\.")[1]);
            int todayDay = Integer.parseInt(today.split("\\.")[2]);

            if(userYear < todayYear){
                temp.add(i);
            } else if(userYear == todayYear && userMonth < todayMonth){
                temp.add(i);
            } else if(userYear == todayYear && userMonth == todayMonth && userDay < todayDay){
                temp.add(i);
            }
        }

        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i) + 1;
        }
        return answer;
    }
}