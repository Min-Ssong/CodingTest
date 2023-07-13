package programmers.none;

import java.util.Arrays;

public class pr34 {
    public static void main(String[] args) {
        int[] a = {1,4,2};
        int[] b = {5,4,4};
        Arrays.sort(a);
        Arrays.sort(b);
        int answer = 0;
        for ( int i = 0; i < a.length; i++ ) {
            answer += a[i] * b[(b.length - 1) - i];
        }
        System.out.println(answer);
    }    
}
