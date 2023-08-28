package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj2587 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> tempArr = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < 5; i++){
			int num = Integer.parseInt(br.readLine());
			tempArr.add(num);
			sum += num;
		}
		Collections.sort(tempArr);
		System.out.println(sum / tempArr.size());
		System.out.println(tempArr.get(tempArr.size() / 2));
    }
}
