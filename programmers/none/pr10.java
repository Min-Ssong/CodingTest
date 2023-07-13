package programmers.none;

public class pr10 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;
        while ( n >= 10 ) {
            answer += n % 10;
            n = n / 10;
        }
        System.out.println( n % (answer + n) == 0 );
    }
}
