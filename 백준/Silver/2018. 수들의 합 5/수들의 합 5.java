import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;
        while(end_index != N){
            if(sum == N){
                count += 1;
                end_index += 1;
                sum += end_index;
            }

            if(sum > N){
                sum -= start_index;
                start_index += 1;
            }

            if(sum < N) {
                end_index += 1;
                sum += end_index;
            }
        }
        System.out.println(count);
        br.close();
    }
}