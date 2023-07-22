package programmers.lv0;

public class pr181856 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1 != sum2){
                answer = Math.max(sum1, sum2) == sum1 ? 1 : -1;
            }
        } else {
            answer = (Math.max(arr1.length, arr2.length) == arr1.length) ? 1 : -1;
        }
        return answer;
    }
}
