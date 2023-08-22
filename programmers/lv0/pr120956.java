public class pr120956 {
    class Solution {
        public int solution(String[] babbling) {
            String[] boo = {"aya", "ye", "woo", "ma"};
            int answer = 0;
            for(int i = 0; i < babbling.length; i++){
                answer += checkStr(babbling[i], boo, answer);
            }
            return answer;
        }
        
        public static int checkStr(String str, String[] boo, int answer){
            for(int i = 0; i < boo.length; i++){
                if(str.equals(boo[i])){
                    return 1;
                }
                
                if(str.startsWith(boo[i])){
                    return checkStr(str.split(boo[i])[1], boo, answer);
                }
            }
            return 0;
        }
    }
}
