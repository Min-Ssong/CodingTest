package programmers.none;

public class pr05 {
    public static void main(String[] args) {
        long n = 3L;
        long i = 1L;
        long answer = 0;
        
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

        System.out.println(answer != -1 ? answer*answer : -1);
    }
}