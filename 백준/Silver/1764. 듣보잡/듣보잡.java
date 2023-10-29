import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String NM = br.readLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int M = Integer.parseInt(NM.split(" ")[1]);
		
		int num = 0;
		Set<String> tempSet = new TreeSet<String>();
		Set<String> resultSet = new TreeSet<String>();
		for(int i = 0; i < N + M; i++){
			String name = br.readLine();
			if(i < N){
				tempSet.add(name);
			}else if(i >= N && tempSet.contains(name)){
				resultSet.add(name);
				num += 1;
			}
		}
		sb.insert(0, num + "\n");
		for(String str : resultSet){
			sb.append(str).append("\n");
		}
		System.out.println(sb.toString());
    }
}
