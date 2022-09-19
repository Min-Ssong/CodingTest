package programmers;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while ( n >= 10 ) {
            answer += n % 10;
            n = n / 10;
        }
        return answer + n;
    }
}

public class pr02 {
    public static void main(String[] args) {
        int num = 1;
		Solution sol = new Solution();
        System.out.print(sol.solution(num));
	}
}