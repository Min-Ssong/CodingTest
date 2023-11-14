class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        Long xlong = Long.valueOf(x);
        for ( int i = 1; i <= n; i++ ) {
            answer[i-1] = xlong * i;
        }
        return answer;
    }
}