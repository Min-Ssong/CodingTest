package BOJ.javaAlgo.before;

import java.io.*;

public class boj3029 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String preTimeStr = br.readLine();
        String startTimeStr = br.readLine();
        int preHour = Integer.parseInt(preTimeStr.split(":")[0]);
        int preMin = Integer.parseInt(preTimeStr.split(":")[1]);
        int preSec = Integer.parseInt(preTimeStr.split(":")[2]);
        int startHour = Integer.parseInt(startTimeStr.split(":")[0]);
        int startMin = Integer.parseInt(startTimeStr.split(":")[1]);
        int startSec = Integer.parseInt(startTimeStr.split(":")[2]);
        int preTime = (preHour * 3600) + (preMin * 60) + preSec;
        int startTime = (startHour * 3600) + (startMin * 60) + startSec;
        int resultTime = (startTime <= preTime) ? (startTime + 86400) - preTime : startTime - preTime;
        int resultHour = resultTime / 3600;
        int resultMin = (resultTime % 3600) / 60;
        int resultSec = (resultTime % 3600) % 60;
        System.out.printf("%s:%s:%s",
            (resultHour < 10) ? "0"+resultHour : resultHour,
            (resultMin < 10) ? "0"+resultMin : resultMin,
            (resultSec < 10) ? "0"+resultSec : resultSec
        );
        
        br.close();
    }

}
