import java.io.*;
// 230919 CT BOJ B3 10991:별찍기16
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int num= 1;
        for(int i= 1; i < N; i++){
            System.out.print(repeat(" ", N - i) + "*");
            if(i != 1){
                System.out.print(repeat(" ", num) +"*");
                num += 2;
            }
            System.out.println();
        }
        System.out.println(repeat("*", N * 2 -1));
    }
    public static String repeat(String str, int times){
        StringBuilder sb= new StringBuilder();
        for(int i= 0; i < times; i++){
            sb.append(str);
        }
        return sb.toString();
    }
}