package SWEA.D1;

import java.util.Scanner;

public class D1_2056 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
            sb.append("#"+test_case+" ");
            String ymd = sc.next();
            String year = ymd.substring(0, 4);
            String month = ymd.substring(4, 6);
            String day = ymd.substring(6, ymd.length());
            if ( Integer.parseInt(month) >= 1 &&
                 Integer.parseInt(month) <= 12 &&
                 Integer.parseInt(day) >= 1 &&
                 Integer.parseInt(day) <= days[Integer.parseInt(month)-1] ) {
                    sb.append(year + "/" + month + "/" + day);
            } else {
                sb.append("-1");
            }
            sb.append("\n");
		}
        System.out.print(sb);
        sc.close();
    }
}