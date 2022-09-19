package programmers;

public class pr03 {
    public static void main(String[] args) {
        int n = 12;
		int answer = 0;
        for ( int i = 1; i <= n / 2; i++ ) {
            answer += (n % i == 0) ? i : 0;
        }
        System.out.print(answer + n);
	}
}