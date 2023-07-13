package programmers.none;

public class pr15 {
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };
        String answer = "";

        for ( int i = 0; i < seoul.length; i++ ) {
            if ( seoul[i].equals("Kim") ) {
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }

        System.out.println(answer);
    }
}
