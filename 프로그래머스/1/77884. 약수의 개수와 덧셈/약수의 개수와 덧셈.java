class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for ( int i = left; i <= right; i++ ) {
            int count = 1;
            for ( int j = 1; j < i; j++ ) {
                count += ( i % j == 0 ) ?  1 : 0;
            }
            answer = ( count % 2 == 0 ) ? answer + i : answer - i;
        }
        return answer;
    }
}