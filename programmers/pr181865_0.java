package programmers;
public class pr181865_0 {
    class Solution {
        public int solution(String binomial) {          
            long result = 0;
            String[] temp = binomial.split(" ");
            switch (temp[1]) {
                case "+":
                    result = Long.parseLong(temp[0]) + Long.parseLong(temp[2]);
                    break;
                case "-": 
                    result = Long.parseLong(temp[0]) - Long.parseLong(temp[2]);
                    break;
                case "*": 
                    result = Long.parseLong(temp[0]) * Long.parseLong(temp[2]);
                    break;
            }
            return (int)result;
        }
    }
}
