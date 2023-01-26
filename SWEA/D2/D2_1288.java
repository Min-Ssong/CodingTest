package SWEA.D2;

import java.util.Scanner;

public class D2_1288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            //System.out.println("#" + test_case);
            String zeroToTen = "0123456789";
            int num = sc.nextInt();
            while(true) {
                if(zeroToTen.equals("")) {
                    System.out.println(zeroToTen);
                    break;
                } else {
                    for(int i = 0; i < Integer.toString(num).length(); i++ ){
                        zeroToTen = zeroToTen.replace(Integer.toString(num % 10), "");
                        num = num / 10;
                    }
                }
            }
        }
        sc.close();
    }
}
