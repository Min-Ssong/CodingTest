import java.util.*;
public class Solution{
    public static int solution(int[] d, int budget){
        Arrays.sort(d);
        int result = 0;
        int answer = 0;
        for(int i = 0; i < d.length; i++){
            result += d[i];
            if(result > budget){
                answer = i;
                break;
            }
        }
        return result <= budget ? d.length : answer;
    }
}