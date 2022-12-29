package BOJ.javaAlgo.before;

import java.io.*;

public class boj5074 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String time = br.readLine();
            if ( time.equals("00:00 00:00") ) {
                System.out.print(result);
                break;
            }
            String startTime = time.split(" ")[0];
            String endTime = time.split(" ")[1];
            int timeA = Integer.parseInt(startTime.split(":")[0]) * 60 + Integer.parseInt(startTime.split(":")[1]);
            int timeB = Integer.parseInt(endTime.split(":")[0]) * 60 + Integer.parseInt(endTime.split(":")[1]);
            int plusTime = timeA + timeB;
            int hour = plusTime / 60;
            int min = plusTime % 60;
            if ( hour >= 24 ) {
                int day = hour / 24;
                result += (hour - (day * 24) < 10 ) ? "0" + (hour - (day * 24)) + ":" : (hour - (day * 24)) + ":";
                result += (min < 10 ) ? "0" + min + " +"+day+"\n" : min + " +"+day+"\n";
            } else {
                result += (hour < 10 ) ? "0" + hour + ":" : hour + ":";
                result += (min < 10 ) ? "0" + min + "\n" : min + "\n";
            }
        }
        br.close();
    }
}