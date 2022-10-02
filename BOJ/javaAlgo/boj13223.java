package BOJ.javaAlgo;

import java.io.*;

public class boj13223 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String timeStart = br.readLine();
        int startTime = (Integer.parseInt(timeStart.split(":")[0]) * 3600)
            + (Integer.parseInt(timeStart.split(":")[1]) * 60)
            + (Integer.parseInt(timeStart.split(":")[2]));

        String timeEnd = br.readLine();
        int endTime = (Integer.parseInt(timeEnd.split(":")[0]) * 3600)
            + (Integer.parseInt(timeEnd.split(":")[1]) * 60)
            + (Integer.parseInt(timeEnd.split(":")[2]));
        int resultTime = 0;

        if ( startTime > endTime ) {
            resultTime = 86400 - (startTime - endTime);
        } else if ( startTime < endTime ) {
            resultTime = endTime - startTime;
        } else {
            resultTime = 86400;
        }
        int hour = resultTime / 3600;
        int min = resultTime / 60 % 60;
        int sec = resultTime % 60;
        sb.append((hour < 10) ? "0"+hour : hour).append(":");
        sb.append((min < 10) ? "0"+min : min).append(":");
        sb.append((sec < 10) ? "0"+sec : sec);
        
        System.out.print(sb);
        br.close();
    }
}