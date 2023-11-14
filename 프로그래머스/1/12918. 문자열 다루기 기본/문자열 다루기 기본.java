class Solution {
    public boolean solution(String s) {
        
        if ( s.length() != 4 && s.length() != 6 ) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            int num = (int)ch;
            if ( num < 48 || num > 57 ) {
                return false;
            }
        }
        return true;
    }
}