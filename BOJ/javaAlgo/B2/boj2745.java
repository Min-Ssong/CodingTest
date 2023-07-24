package BOJ.javaAlgo.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj2745 {
    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String N = st.nextToken();
            String B = st.nextToken();
            
            Map<String, Integer> map = new HashMap<String, Integer>();
            for(int i = 0; i < 26; i++){
                map.put(String.valueOf((char)(65 + i)), i + 10);
            }
            
            int result = 0;
            String[] temp = N.split("");
            for(int i = 0; i < temp.length; i++){
                double num = (Math.pow(Integer.parseInt(B), N.length() - 1 - i));
                result += (map.get(temp[i]) != null)
                    ? map.get(temp[i]) * num
                    : Integer.parseInt(temp[i]) * num;
            }
            System.out.println(result);
            br.close();
        }
    }
}
