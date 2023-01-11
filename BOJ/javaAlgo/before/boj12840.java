package BOJ.javaAlgo.before;

import java.io.*;

public class boj12840 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String timeStr = br.readLine();
        int time = (Integer.parseInt(timeStr.split(" ")[0]) * 3600)
            + (Integer.parseInt(timeStr.split(" ")[1]) * 60)
            + (Integer.parseInt(timeStr.split(" ")[2]));
        int q = Integer.parseInt(br.readLine());
        for ( int i = 0; i < q; i++ ) {
            String inputTS = br.readLine();
            if ( inputTS.equals("3") ) {
                sb.append((time / 3600) +" "+ (time / 60 % 60) +" "+ (time % 60) + "\n");
            } else {
                String[] splitTS = inputTS.split(" ");
                String T = splitTS[0];
                int sec = Integer.parseInt(splitTS[1]);
                if ( T.equals("1") ) { 
                    time = (time + sec) % 86400;
                } else {
                    time = (time - sec) % 86400;
                }
                if(time < 0) time += 24 * 3600;
            }
        }
        System.out.print(sb);
        br.close();
    }
}