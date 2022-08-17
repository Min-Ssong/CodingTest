package BOJ.javaAlgo;

import java.util.Scanner;

public class boj4716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        while ( true ) {
            float inputs = sc.nextFloat();
            if ( inputs == -1.0 ) {
                break;
            } else {
                result += "Objects weighing " 
                       + String.format("%.2f", inputs)
                       + " on Earth will weigh "
                       + String.format("%.2f", inputs * 0.167) 
                       + " on the moon. \n";
            }
        }
        System.out.print(result);

        sc.close();
    }
}