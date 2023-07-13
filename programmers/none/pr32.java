package programmers.none;

public class pr32 {
    public static void main(String[] args) {
        String s = "1111111";
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
        System.out.printf("%d %d", answer[0], answer[1]);
    }
}
