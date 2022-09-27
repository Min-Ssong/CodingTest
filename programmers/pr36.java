package programmers;

import java.util.ArrayList;
import java.util.List;

public class pr36 {
    public static void main(String[] args) {
        //int[] arr = {4,4,4,3,3};
        int[] arr = {1,1,3,3,0,1,1};
        List<Integer> temp = new ArrayList<>();

        temp.add(arr[0]);
        for (int num : arr) {
            if ( !temp.contains(num) ) {
                temp.add(num);
            }
        }
        for (Integer integer : temp) {
            System.out.println(integer);
        }
    }
}
