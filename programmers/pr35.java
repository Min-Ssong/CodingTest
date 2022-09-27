package programmers;

public class pr35 {
    /* Stack을 사용하지 않는 풀이 */
    public static void main(String[] args) {
        String s = "())()(()";
        boolean answer = true;
        if ( s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' ){
            System.out.println(false);
        }

        int count = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            count = ( s.charAt(i) == '(' ) ? count + 1 : count - 1;
            if ( count < 0 ) {
                answer = false;
                break;
            }
        }
        answer = ( count != 0 ) ? false : true;
        System.out.println(answer);
    }

    /* Stack을 사용하는 풀이
    public static void main(String[] args) {
        String s = "())()(()";
        boolean answer = true;
        if ( s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' ){
            System.out.println(false);
        }

        Stack<String> stack = new Stack<>();
        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt(i) == '(' ) {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                if ( !(stack.empty()) ) {
                    stack.pop();
                }
            }
        }
        answer = stack.empty();
        System.out.print(answer);
    }
     */
}
