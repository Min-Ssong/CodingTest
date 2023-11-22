import java.util.*;

public class Solution{
    public static int[] solution(int N, int[] stages){
        double[] overNum = new double[N];
        for(int i = 0; i < stages.length; i++){
            if(stages[i] > N){
                continue;
            } else {
                overNum[stages[i] - 1] += 1;
            }
        }
        
        double underNum = stages.length;
        Double[] failPer = new Double[N];
        for(int i = 0; i < failPer.length; i++){
            failPer[i] = overNum[i] != 0.0 ? overNum[i] / underNum : 0.0;
            underNum -= overNum[i];
        }
        
        int[] answer = new int[N];
        Double[] cpFailPer = failPer.clone();
        Arrays.sort(failPer, Collections.reverseOrder());
        int len = 0;
        for(int i = 0; i < failPer.length; i++){
            for(int j = 0; j < failPer.length; j++){
                if(failPer[i] == cpFailPer[j]){
                    answer[len++] = j+1;
                    cpFailPer[j] = 0.0;
                }
            }
        }
        
        return answer;
    }
}