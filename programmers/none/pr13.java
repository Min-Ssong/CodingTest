package programmers.none;

public class pr13 {
    public static void main(String[] args) {
        int num = 626331;
        long numlong = num;
        int answer = 1;
        if ( numlong == 1 ) {
            System.out.println(0);
        } else {
            while ( true ) {
                if ( answer == 500 ) {
                    System.out.printf("%d %d", numlong, answer);
                    break;
                }

                if ( numlong == 1 ) {
                    System.out.println(answer);
                } else {
                    numlong = ( numlong % 2 == 0 ) ? numlong / 2 : numlong * 3 + 1;
                    answer++;
                }
            }
        }
    }
}
