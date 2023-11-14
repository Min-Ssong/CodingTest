class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if ( s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' ){
            return false;
        }

        int count = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            count = ( s.charAt(i) == '(' ) ? count + 1 : count - 1;
            if ( count < 0 ) {
                return false;
            }
        }
        answer = ( count != 0 ) ? false : true;
        return answer;
    }
}