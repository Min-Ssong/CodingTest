package programmers.none;

public class pr18 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] answer =  new int[( arr.length != 1 ) ? arr.length - 1 : 1];
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( min != arr[i]) {
                min = ( min > arr[i]) ? arr[i] : min;
            }
        }
        if ( arr.length == 1 ) {
            answer[0] = -1;
        } else {
            for ( int i = 0; i < arr.length; i++ ) {
                if ( arr[i] != min ) {
                    answer[i] = arr[i];
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
