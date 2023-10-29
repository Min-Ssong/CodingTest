import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] tempArr = new int[num];
		for(int i = 0; i < num; i++){
			tempArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i < tempArr.length; i++){
			int key = tempArr[i];
			int j = i - 1;
			while(j >= 0 && tempArr[j] > key){
				tempArr[j + 1] = tempArr[j];
				j -= 1;
			}
			tempArr[j+1] = key;
		}
		
		for(int i : tempArr){
			System.out.println(i);
		}
    }
}
