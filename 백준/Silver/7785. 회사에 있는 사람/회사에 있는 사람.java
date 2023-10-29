import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Set<String> nSet = new TreeSet<String>(Comparator.reverseOrder());
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			if("enter".equals(status)){
				nSet.add(name);
			} else {
				nSet.remove(name);
			}
		}
		
		for(String str : nSet){
			sb.append(str).append("\n");
		}
		System.out.println(sb);
    }
}