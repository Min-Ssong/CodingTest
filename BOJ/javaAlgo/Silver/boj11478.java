package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class boj11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = 1;
		Set<String> tempSet = new HashSet<String>();
		while(true){
			if(num == str.length() + 1) break;
			for(int i = 0; i <= str.length() - num; i++){
				tempSet.add(str.substring(i, i+num));
			}
			num += 1;
		}
		System.out.println(tempSet.size());
    }
}
