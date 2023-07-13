package programmers.none;

public class pr33 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int[] answer = new int[2];
        int LCM = n * m;
        int rest = 0;
        while ( true ) {
            rest = n % m;
            n = m;
            m = rest;

            if ( rest == 0 ) {
                answer[0] = n;
                answer[1] = LCM / n;
                break;
            }
        }
        System.out.printf("%d %d", answer[0], answer[1]);
    }
}
