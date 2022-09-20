package programmers;

public class pr14 {
    public static void main(String[] args) {
        long a = -10000000;
        long b = 10000000;
        long answer = 0;
        if ( a != b ) {
            for ( long i = Math.min(a, b); i <= Math.max(a, b); i++ ) {
                answer += i;
            }
        } else {
            answer = a;
        }
        System.out.println(answer);
    }
}
