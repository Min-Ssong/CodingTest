import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Set<String> strSet = new HashSet<String>();
		for(int i = 0; i < N; i++) strSet.add(br.readLine());
		List<String> arr = new ArrayList<>(strSet);
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()){
					return 1;
				} else if(o1.length() < o2.length()){
					return -1;
				}
				
				return o1.compareTo(o2);
			}
		});
		
		for(int i = 0; i < arr.size(); i++){
			sb.append(arr.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}