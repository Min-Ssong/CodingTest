package BOJ;

import java.util.Scanner;

public class boj4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jahawn = sc.nextLine();
        String doctor = sc.nextLine();
        String pureJa = jahawn.substring(0, jahawn.length()-1);
        String pureDa = doctor.substring(0, doctor.length()-1);
        
        if( pureJa.length() < pureDa.length() ){
            System.out.println("no");
        } else {
            System.out.println("go");
        }
        
        sc.close();
    }
}
