package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine().toLowerCase();

            if( str.equals("#") ){
                sc.close();
                break;
            } else {
                System.out.printf("%d\n",
                countChar(str, 'a')
                + countChar(str, 'e')
                + countChar(str, 'i')
                + countChar(str, 'o')
                + countChar(str, 'u'));
            }
        }
    }
    public static int countChar(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}
