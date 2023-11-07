public class PR155652 {
    class Solution {
        public String solution(String s, String skip, int index) {
            int[] tempArr = new int[skip.length()];
            for(int i = 0; i < skip.length(); i++){
                tempArr[i] = skip.toCharArray()[i];
            }
            
            String answer = "";
            char[] charStr = s.toCharArray();
            for(int i = 0; i < charStr.length; i++){
                int num = charStr[i];
                for(int j = 0; j < index; j++){
                    num += 1;
                    if(num > 122) num -= 26;
                    while(skip.indexOf(num) != -1){
                        num += 1;
                        if(num > 122) num -= 26;
                    }
                    if(num > 122) num -= 26;
                }
                answer += (char)num;
            }
            return answer;
        }
    }   
}
