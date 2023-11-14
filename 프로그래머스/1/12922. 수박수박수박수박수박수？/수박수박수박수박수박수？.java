class Solution {
    public String solution(int n) {
        String answer = "수박".repeat(n/2);
        answer += ( n % 2 == 0 ) ? "" : "수";
        return answer;
    }
}