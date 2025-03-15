import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String[] changNumberStr = br.readLine().split(" ");
            int changeNumberOne = Integer.parseInt(changNumberStr[0]);
            int changeNumberTwo = Integer.parseInt(changNumberStr[1]);

            char tmepChar = word[changeNumberOne];
            word[changeNumberOne] = word[changeNumberTwo];
            word[changeNumberTwo] = tmepChar;
        }
        System.out.println(new String(word));
    }
}