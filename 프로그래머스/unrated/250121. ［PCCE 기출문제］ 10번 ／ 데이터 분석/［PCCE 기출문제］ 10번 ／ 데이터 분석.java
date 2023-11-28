import java.util.*;

public class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by){
        List<int[]> list = new ArrayList<int[]>();
        String[] str = {"code", "date", "maximum", "remain"};
        int extNum = 0;
        int sortNum = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(ext)) extNum = i;
            if(str[i].equals(sort_by)) sortNum = i;
        }
        
        for(int i = 0 ; i < data.length; i++){
            if(data[i][extNum] < val_ext) list.add(data[i]);
        }
        
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j < list.size(); j++){
                if(list.get(j)[sortNum] < min){
                    min = list.get(j)[sortNum];
                    index = j;
                }
            }
            int[] temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
        
        int[][] answer = new int[list.size()][4];
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = list.get(i)[j];
            }
        }
        
        return answer;
    }
}