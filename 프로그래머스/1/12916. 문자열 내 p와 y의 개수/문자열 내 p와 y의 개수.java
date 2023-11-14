class Solution {
    boolean solution(String s) {
        String[] temp = s.toUpperCase().split("");
        int count = 0;
        for (String str : temp) {
            if ( str.equals("Y") ) {
                count += 1;
            } else if ( str.equals("P") ){
                count -= 1;
            }
        }
        if ( count == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}