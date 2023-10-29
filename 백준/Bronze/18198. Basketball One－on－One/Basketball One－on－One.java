import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] scoreAll = br.readLine().toCharArray();
        int resultA = 0;
        int resultB = 0;
        for ( int i = 0; i < scoreAll.length; i++ ) {
            if( i % 2 != 0 ) {
                // 점수 집계
                int point = Integer.parseInt(String.valueOf(scoreAll[i]));
                if ( scoreAll[i-1] == 'A' ) {
                    resultA += point;
                } else {
                    resultB += point;
                }
            }
        }
        System.out.println((resultA > resultB) ? "A" : "B");
        br.close();
    }
}
