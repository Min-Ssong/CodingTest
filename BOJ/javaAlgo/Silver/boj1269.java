package BOJ.javaAlgo.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] AB = br.readLine().split(" ");
		int A = Integer.parseInt(AB[0]);
		int B = Integer.parseInt(AB[1]);
		
		Set<Integer> aSet = new HashSet<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++){
			aSet.add(Integer.parseInt(st.nextToken()));	
		}
		
		Set<Integer> bSet = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++){
			bSet.add(Integer.parseInt(st.nextToken()));
		}
		
		Set<Integer> diffAB = new HashSet<Integer>();
		diffAB.addAll(aSet);
		
		Set<Integer> diffBA = new HashSet<Integer>();
		diffBA.addAll(bSet);
		
		diffAB.removeAll(diffBA);
		bSet.removeAll(aSet);
		System.out.println(diffAB.size() + bSet.size());
    }
}
