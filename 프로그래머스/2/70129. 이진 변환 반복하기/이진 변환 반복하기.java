class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while ( true ) {
            if ( s.equals("1") ) {
                break;
            }
            int countOne = 0;
            String[] splitStr = s.split("");
            for ( int i = 0; i < splitStr.length; i++ ) {
                if ( splitStr[i].equals("0") ) {
                    answer[1] += 1;
                } else {
                    countOne += 1;
                }
            }
            s = Integer.toBinaryString(countOne);
            answer[0] += 1;
        }
        return answer;
    }
}