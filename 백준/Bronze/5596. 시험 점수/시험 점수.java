import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int s = 0;
        int temp = 0;
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 4; j ++ ) {
                temp += sc.nextInt();
                if( i == 0 ) {
                    k = temp;
                } else {
                    s = temp;
                }
            }
            temp = 0;
        }
        if( k > s){
            System.out.println(k);
        } else {
            System.out.println(s);
        }
        sc.close();
    }
}
