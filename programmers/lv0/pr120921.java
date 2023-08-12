public class pr120921 {
    class Solution {
        public int solution(String A, String B) {
            int num = 0;
            while(true){
                if(num == A.length()){
                    num = -1;
                    break;
                }else if(A.equals(B)){
                    break;
                }
                
                A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
                num++;
            }
            return num;
        }
    }   
}