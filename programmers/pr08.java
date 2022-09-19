package programmers;

public class pr08 {
    public static void main(String[] args) {
        int n = 12;
        int x = 1;
        while ( true ) {
            if ( n % x == 1 ) {
                System.out.println(x);
                break;
            }
            x += 1;
        }
    }
}
