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