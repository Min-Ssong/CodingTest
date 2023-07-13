package programmers.none;

public class pr26 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "1e10";

        if ( s.length() != 4 && s.length() != 6 ) {
            answer = false;
        }

        for (char ch : s.toCharArray()) {
            int num = (int)ch;
            if ( num < 48 || num > 57 ) {
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
