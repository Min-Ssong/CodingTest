package BOJ.javaAlgo;

import java.util.Scanner;

public class boj18968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String result = "";
        for ( int i = 0; i < len; i++ ) {
            String upAndDown = sc.nextLine();
            if ( upAndDown.indexOf("D") == -1 ) {
                result += String.valueOf(upAndDown.length()) + "\n";
            } else {
                result += upAndDown.substring(0, upAndDown.indexOf("D")).length() + "\n";
            }
        }
        System.out.print(result);
        sc.close();
    }
}
