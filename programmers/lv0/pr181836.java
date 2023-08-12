public class pr181836 {
    class Solution {
        public String[] solution(String[] picture, int k) {
            String[] answer = new String[picture.length * k];
            for(int i = 0; i < picture.length; i++){
                String temp = "";
                for(char str : picture[i].toCharArray()){
                    temp += Character.toString(str).repeat(k);
                }
                
                for(int j = i * k; j < i * k + k; j++){
                    answer[j] = temp;
                }
            }
            return answer;
        }
    }
}
