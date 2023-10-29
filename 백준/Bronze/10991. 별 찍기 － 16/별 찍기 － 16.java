import java.io.*;

// 230919 CT BOJ B3 10991:별찍기16
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i= 1; i <= N; i++){
            System.out.print(repeat(" ", N - i) +"*");
            System.out.print(repeat(" *", i - 1));
            if(i != N) System.out.println();
        }
    }
    public static String repeat(String str, int times){
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < times; i++){
            sb.append(str);
        }
        return sb.toString();
    }
}