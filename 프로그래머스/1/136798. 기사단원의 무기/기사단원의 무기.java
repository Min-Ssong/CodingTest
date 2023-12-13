import java.util.*;
public class Solution {
    public static int solution(int number, int limit, int power) {
        int[] commonDiv = makeCommonDivArr(number);
        int answer = 0;
        for(int num : commonDiv) answer += (num > limit) ? power : num;
        return answer;
    }
    
    public static int[] makeCommonDivArr(int number){
        int[] temp = new int[number + 1];
        temp[0] = 0;
        for(int i = 1; i <= number; i++){
            int num = 0;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i)      num += 1;
                else if(i % j == 0) num += 2;
            }
            temp[i] += num;
        }
        return temp;
    }
}