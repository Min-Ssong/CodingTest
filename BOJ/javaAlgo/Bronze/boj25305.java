package BOJ.javaAlgo.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class boj25305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] Nk = br.readLine().split(" ");
		int N = Integer.parseInt(Nk[0]);
		int k = Integer.parseInt(Nk[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> tempArr = new ArrayList<Integer>();
		for(int i = 0; i < N; i++){
			tempArr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(tempArr, Collections.reverseOrder());
		System.out.println(tempArr.get(k-1));
    }
}
