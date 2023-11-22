public class Solution {
    public static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        int[] tempArray = new int[k];
        int min = Integer.MAX_VALUE;
        int scoreNum = 0;
        for(int i = 0; i < k; i++){
            scoreNum = i < score.length ? score[i] : -1;
            tempArray[i] = scoreNum;
            min = scoreNum < min ? scoreNum : min;
            if(i < score.length)
                answer[i] = min;
        }
        
        for(int i = k; i < score.length; i++){
            if(min < score[i]){
                tempArray = mSort(tempArray, score[i]);
                min = tempArray[tempArray.length-1];
            }
            answer[i] = min;
        }
        
        return answer;
    }
    
    public static int[] mSort(int[] array, int n){
        int[] tempArr = new int[array.length + 1];
        for(int i = 0; i < tempArr.length; i++){
            tempArr[i] = i != tempArr.length - 1 ? array[i] : n;
        }
        
        int temp, j = 0;
        for(int i = tempArr.length - 2; i >= 0; i--){
            j = i;
            while(j != tempArr.length-1 && tempArr[j] < tempArr[j+1]){
                temp = tempArr[j];
                tempArr[j] = tempArr[j+1];
                tempArr[j+1] = temp;
                j++;
            }
        }
        
        int[] result = new int[array.length];
        for(int i = 0; i < result.length; i++){
            result[i] = tempArr[i];
        }
        
        return result;
    }
    
}