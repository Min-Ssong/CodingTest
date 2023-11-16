import java.util.*;
public class Solution{
    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];
        for(int i = 0; i < arr1.length; i++){
            String binNum1 = Integer.toString(arr1[i], 2);
            String binNum2 = Integer.toString(arr2[i], 2);
            String num1 = binNum1.length() != n ? repeat(binNum1, n-binNum1.length()) : binNum1;
            String num2 = binNum2.length() != n ? repeat(binNum2, n-binNum2.length()) : binNum2;
            char[] numCh1 = num1.toCharArray();
            char[] numCh2 = num2.toCharArray();
            String result = "";
            for(int j = 0; j < numCh1.length; j++){
                result += (numCh1[j] == '1' || numCh2[j] == '1') ? "#" : " ";
            }
            answer[i] = result;
        }
        return answer;
    }
    
    public static String repeat(String s, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += "0";
        }
        return str.concat(s);
    }
}