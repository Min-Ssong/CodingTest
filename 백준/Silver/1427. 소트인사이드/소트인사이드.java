import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		List<String> tempArr = new ArrayList<String>();
		for(int i = 0; i < str.length; i++){
			tempArr.add(str[i]);
		}
		Collections.sort(tempArr, Collections.reverseOrder());
		for(Object obj : tempArr.toArray()){
			System.out.print(obj);
		}
    }
}
