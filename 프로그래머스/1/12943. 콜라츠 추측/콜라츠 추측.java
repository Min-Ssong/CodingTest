class Solution {
    public int solution(int num) {
        int i = 1;
        long numlong = num;
        int answer = 0;
        if ( numlong == 1 ) {
            return 0;
        } else {
            while ( true ) {
                if ( answer == 500 ) {
                    return -1;
                }

                if ( numlong == 1 ) {
                    return answer;
                } else {
                    numlong = ( numlong % 2 == 0 ) ? numlong / 2 : numlong * 3 + 1;
                    answer++;
                }
            }
        }
    }
}