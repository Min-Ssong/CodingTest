class Solution {
    public boolean solution(int x) {
        int n = x;
        int answer = 0;
        while ( n >= 10 ) {
            answer += n % 10;
            n = n / 10;
        }
        return x % (answer + n) == 0;
    }
}