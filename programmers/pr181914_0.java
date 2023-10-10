package programmers;
public class pr181914_0 {
    class Solution {
        public int solution(String number) {
            int sum = 0;
            for (char c : number.toCharArray()) {
                sum += c - '0';
            }
            return sum % 9;
        }
    }
}
