package programmers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 230913 CT PR 42748 : K번째 수
public class pr42748_1 {
	public static void main(String[] args) throws Exception{
		solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
	}
	
	public static int[] solution(int[] array, int[][] commands){
		int[] answer = new int[commands.length];
		for(int i = 0; i < commands.length; i++){
			// ver.1 내장 sort를 사용하는 방법
			List<Integer> temp = new ArrayList<Integer>();
			for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
				temp.add(array[j]);
			}
			
			Collections.sort(temp);
			answer[i] = temp.get(commands[i][2] - 1);
			
			
			//  ver.2 Insertion Sort(삽입정렬)을 이용해서 푸는 방법
// 			int num = 0;
// 			int len = commands[i][1] - commands[i][0] + 1;
			
// 			int[] temp = new int[len];
// 			for(int j = commands[i][0]; j <= commands[i][1]; j++){
// 				temp[num++] = array[j-1];
// 			}
			
// 			temp = insertSort(temp);
// 			answer[i] = temp[commands[i][2] - 1];
			
		}
        
		return answer;
	}
	
	public static int[] insertSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j+1]= arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}