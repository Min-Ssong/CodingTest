class Solution {
    public long solution(int a, int b) {
        long aLong = a;
        long bLong = b;
        long answer = 0;
        
        if ( a != b ) {
            for ( long i = Math.min(a, b); i <= Math.max(a, b); i++ ) {
                answer += i;
            }
        } else {
            answer = aLong;
        }
        return answer;
    }
}