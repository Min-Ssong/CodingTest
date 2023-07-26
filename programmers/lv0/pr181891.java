package programmers.lv0;

public class pr181891 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = 0;
        for(int i = n; i < num_list.length; i++){
            answer[num++] = num_list[i];
        }

        int num1 = num;
        for (int i = 0; i < num_list.length - num; i++) {
            answer[num1++] = num_list[i];
        }
        return answer;
    }
}

/*

import java.util.Arrays;
class Solution {
     public static int[] solution(int[] num_list, int n) {
        int[] part1 = Arrays.copyOfRange(num_list, 0, n);
        int[] part2 = Arrays.copyOfRange(num_list, n, num_list.length);

        int[] result = new int[num_list.length];
        System.arraycopy(part2, 0, result, 0, part2.length);
        System.arraycopy(part1, 0, result, part2.length, part1.length);
        
        return result;
    }
}

*/
