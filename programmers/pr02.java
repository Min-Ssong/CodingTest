package programmers;

public class pr02 {
    public static void main(String[] args) {
        int n = 1;
		int answer = 0;
        while ( n >= 10 ) {
            answer += n % 10;
            n = n / 10;
        }
        System.out.print(answer + n);
	}
}