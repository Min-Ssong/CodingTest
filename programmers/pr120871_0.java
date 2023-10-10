package programmers;
public class pr120871_0 {
    class Solution {
        public int solution(int n) {
            int num = 0, i = 0;
            while(i != n){
                i++;
                num++;
                
                if(num % 3 == 0 || Integer.toString(num).contains("3")){
                    num++;
                    while(num % 3 == 0 || Integer.toString(num).contains("3")){
                        num++;
                    }
                }
            }
            return num;
        }
    }    
}
