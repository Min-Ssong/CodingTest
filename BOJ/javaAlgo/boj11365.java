package BOJ.javaAlgo;

import java.util.Scanner;

public class boj11365 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result = "";
        while ( true ) {
            String sentence = sc.nextLine();
            if ( sentence.equals("END") ) {
                break;
            } else {
                String revers = "";
                for ( int i = sentence.length()-1; i >= 0; i-- ) {
                    revers += sentence.toCharArray()[i];
                }
                result += revers + "\n"; 
            }
        }
        System.out.print(result);
        sc.close();
    }
}
