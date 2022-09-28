package programmers;

import java.util.ArrayList;
import java.util.List;

public class pr36 {
    public static void main(String[] args) {
        //int[] arr = {4,4,4,3,3};
        //int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {1,1,2,3,2,3,1,1};
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        int num = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            int num2 = arr[i];
            if ( num != num2 ) {
                num = num2;
                temp.add(num2);
            }
        }
        int[] answer = new int[temp.size()];
        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = temp.get(i);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
