package BOJ.javaAlgo.before;

import java.io.*;

public class boj4758 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while ( true ) {
            String num = br.readLine();
            Double speed = Double.parseDouble(num.split(" ")[0]);
            Double weight = Double.parseDouble(num.split(" ")[1]);
            Double strenght = Double.parseDouble(num.split(" ")[2]);
            Boolean isPosition = false;
            if ( speed == 0 && weight == 0 && strenght == 0 ) {
                System.out.print(result);
                break;
            }

            if ( speed <= 4.5 && weight >= 150 && strenght >= 200 ) {
                result += "Wide Receiver ";
                isPosition = true;
            }
            
            if ( speed <= 6.0 && weight >= 300 && strenght >= 500 ) {
                result += "Lineman ";
                isPosition = true;
            }
            
            if ( speed <= 5.0 && weight >= 200 && strenght >= 300 ) {
                result += "Quarterback ";
                isPosition = true;
            }


            if ( !isPosition ) {
                result += "No positions";
            }
            result += "\n";
        }
        br.close();
    }
}
