import java.util.ArrayList;
import java.util.List;

public class pr181844 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    break;
                }
            }
            if(arr[i] != 0) result.add(arr[i]);
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i).intValue();
        }
        return answer;
    }
}
