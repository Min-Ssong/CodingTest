package BOJ.javaAlgo.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2720 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] QDNP = new int[4];
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int C = Integer.parseInt(st.nextToken());
			while(C != 0){
				if( C >= 25 ) {
					QDNP[0] = C / 25;
					C %= 25;
				} else if( C >= 10 ) {
					QDNP[1] = C / 10;
					C %= 10;
				} else if( C >= 5 ) {
					QDNP[2] = C / 5;
					C %= 5;
				} else{
					QDNP[3] = C;
					C = 0;
				}
			}
			
			for(int j = 0; j < QDNP.length; j++){
				sb.append(QDNP[j] + " ");
				QDNP[j] = 0;
			}
			sb.append("\n");
		}
		System.out.println(sb);
    }
}
