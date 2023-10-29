import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        for(int i = 0; i < num; i++){
			tempArr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(tempArr);
		for(int i : tempArr){
			sb.append(i).append("\n");
		}
        System.out.println(sb.toString());
    }
}
