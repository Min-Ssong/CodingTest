package SWEA;

import java.util.Scanner;

public class D1_1936 {
    public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        String result = "";
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( (a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2) ) {
            result = "A";
        } else {
            result = "B";
        }
        System.out.println(result);
        sc.close();
	}
}
