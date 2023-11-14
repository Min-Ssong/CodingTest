class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 1L;
        
        while ( true ) {
            if ( i * i == n ) {
                answer = i + 1;
                break;
            } else if ( i >= n / 2 ) {
                answer = -1L;
                break;
            }

            i += 1;
        }
        return answer != -1 ? answer*answer : -1;
    }
}