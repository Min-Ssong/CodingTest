package programmers.lv0;

public class pr181914 {
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
