class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int mul = n * m;
        int rest = 0;
        while ( true ) {
            rest = n % m;
            n = m;
            m = rest;

            if ( rest == 0 ) {
                answer[0] = n;
                answer[1] = mul / n;
                break;
            }
        }
        return answer;
    }
}