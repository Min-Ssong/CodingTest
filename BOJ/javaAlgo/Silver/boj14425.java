package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class boj14425 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NM= br.readLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int M = Integer.parseInt(NM.split(" ")[1]);
		
		int num = 0;
		Set<String> strSet = new HashSet<String>();
		for(int i = 0; i < N + M; i++){
			String str = br.readLine();
			if(i < N){
				strSet.add(str);
			}
			
			if(i >= N && strSet.contains(str)){
				num++;
			}
		}
		System.out.println(num);
    }
}
