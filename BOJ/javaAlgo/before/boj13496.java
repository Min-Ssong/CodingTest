package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj13496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        int result = 0;
        String endStr = "";
        for ( int i = 0; i < len; i++ ) {
            String[] nsc = sc.nextLine().split(" ");
            for ( int j = 0; j < Integer.parseInt(nsc[0]); j++ ) {
                String[] dv = sc.nextLine().split(" ");
                float temp = Float.parseFloat(dv[0]) / Float.parseFloat(nsc[1]);
                result  += (Math.ceil(temp) <= Integer.parseInt(nsc[2])) ? Integer.parseInt(dv[1]) : 0;
            }
            endStr += "Data Set " + (i + 1) + ":\n" + result + "\n";
            endStr += (i == len - 1) ? "" : "\n";
            result = 0;
        }
        System.out.print(endStr);
        sc.close();
    }
}
