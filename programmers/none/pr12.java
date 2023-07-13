package programmers.none;

public class pr12 {
    public static void main(String[] args) {
        Long x = -4L;
        int n = 2;
        long[] answer = new long[n];
        Long xlong = Long.valueOf(x);
        for ( int i = 1; i <= n; i++ ) {
            answer[i-1] = xlong * i;
        }
    }
}
