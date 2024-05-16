import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[N];
        int len = 0;
        while(st.hasMoreTokens()){
            intArr[len++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intArr);

        int i = 0;
        int j = intArr.length - 1;
        int count = 0;
        while(i < j){
            if(intArr[i] + intArr[j] == M){
                count += 1;
                i += 1;
                j -= 1;
            } else if(intArr[i] + intArr[j] > M){
                j -= 1;
            } else if(intArr[i] + intArr[j] < M){
                i += 1;
            }
        }
        System.out.println(count);
        br.close();
    }

}