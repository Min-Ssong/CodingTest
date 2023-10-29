import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String startTime = br.readLine();
        String[] startTimes = startTime.split(" : ");

        String endTime = br.readLine();
        String[] endTimes = endTime.split(" : ");

        int startTimeSec = (Integer.parseInt(startTimes[0]) * 3600) 
            + (Integer.parseInt(startTimes[1]) * 60) 
            + Integer.parseInt(startTimes[2]);
        int endTimeSec = (Integer.parseInt(endTimes[0]) * 3600) 
            + (Integer.parseInt(endTimes[1]) * 60) 
            + Integer.parseInt(endTimes[2]);
        
        int result = endTimeSec - startTimeSec;
        System.out.println(( result > 0 ) ? result : result + 86400);

        br.close();
    }
}
