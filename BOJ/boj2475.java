package BOJ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class boj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        double temp = 0.0;
        for( int i = 0; i < 5; i++ ) {
            int num = Integer.parseInt(inputStr.trim().split(" ")[i]);
            temp += Math.pow(num, 2);
        }
        
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println(df.format(temp%10));

        sc.close();
    }
}
