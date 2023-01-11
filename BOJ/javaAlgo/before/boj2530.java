package BOJ.javaAlgo.before;

import java.io.*;

public class boj2530 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String M = br.readLine();
        String[] times = N.split(" ");
        int time = Integer.parseInt(times[0]) * 3600 + Integer.parseInt(times[1]) * 60 + Integer.parseInt(times[2]) + Integer.parseInt(M);
        
        int hour = time/3600 >= 24 ? time/3600 - 24 : time/3600;
        int min = (time%3600)/60 >= 60 ? (time%3600)/60 - 60 : (time%3600)/60;
        int sec = (time%3600)%60 >= 60 ? (time%3600)%60 - 60 : (time%3600)%60;
        System.out.printf("%d %d %d", hour, min, sec);
        br.close();
    }
}