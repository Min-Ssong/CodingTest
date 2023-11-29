import java.util.*;
public class Solution {
    static ArrayList<int[]> list = new ArrayList<int[]>();
    public static int solution(int[] nums) {
        int n = 0;
        for(int a : nums) n += a;
        boolean[] isPrime = isPrime(n);
        
        combine(nums, 3, 0, new ArrayList<Integer>());
        int answer = 0;
        for(int i = 0; i < list.size(); i++){
            int result = 0;
            for(int j = 0; j < list.get(i).length; j++){
                result += list.get(i)[j];
            }
            answer += isPrime[result] ? 1 : 0;
        }
        return answer;
    }
    
    public static void combine(int[] arr, int k, int start, List<Integer> current){
        if(current.size() == k){
            int[] temp = new int[current.size()];
            for(int i = 0; i < current.size(); i++){
                temp[i] = current.get(i);
            }
            list.add(temp);
            return;
        }
        
        for(int i = start; i < arr.length; i++){
            current.add(arr[i]);
            combine(arr, k, i+1, current);
            current.remove(current.size() - 1);
        }
    }
    
    public static boolean[] isPrime(int num){
        boolean[] temp = new boolean[num+1];
        Arrays.fill(temp, true);
        temp[0] = false;
        temp[1] = false;
        for(int i = 2; i * i <= num; i++){
            if(temp[i]){
                for(int j = i * i; j <= num; j += i){
                    temp[j] = false;
                }
            }
        }
        return temp;
    }
}