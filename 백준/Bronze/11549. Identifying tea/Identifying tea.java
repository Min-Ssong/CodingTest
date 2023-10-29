import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tea = br.readLine();
        String[] answer = br.readLine().split(" ");
        int count = 0;
        for (String str : answer) {
            if( tea.equals(str) ){
                count += 1;
            }
        }
        System.out.print(count);
        br.close();
    }
}
