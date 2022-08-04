package BOJ.javaAlgo;

import java.util.Scanner;

public class boj8718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() * 1000;
        int k = sc.nextInt() * 1000;
        
        int bigK = k + ( k / 2 ) + ( k / 4 );
        int middleK = ( k * 2 ) + k + ( k / 2 );
        int smallK = ( k * 4 ) + ( k * 2 ) + k;

        String flag = "";
        if ( bigK < x ) {
            flag += "big ";
        } 
        if ( middleK < x ) {
            flag += "middle ";
        }
        if ( smallK < x) {
            flag += "small ";
        }

        if( flag.split(" ").length == 1 ) {
            if( flag.split(" ")[0].equals("big") ) {
                System.out.println(bigK);
            } else if ( flag.split(" ")[0].equals("middle") ) {
                System.out.println(middleK);
            } else if ( flag.split(" ")[0].equals("small") ) {
                System.out.println(smallK);
            }
        } else if( flag.split(" ").length == 2 ){
            String firstK = flag.split(" ")[0];
            String secondK = flag.split(" ")[1];
            if( firstK.equals("big") && secondK.equals("middle") ) {
                if ( bigK > middleK ) {
                    System.out.println(bigK);
                } else {
                    System.out.println(middleK);
                }
            } else if ( firstK.equals("big") && secondK.equals("small") ) {
                if ( bigK > smallK ) {
                    System.out.println(bigK);
                } else {
                    System.out.println(smallK);
                }
            } else if ( firstK.equals("middle") && secondK.equals("small") ) {
                if ( middleK > smallK) {
                    System.out.println(middleK);
                } else {
                    System.out.println(smallK);
                }
            }
        } else {
            if ( bigK > middleK ) {
                if ( bigK > smallK ) {
                    System.out.println(bigK);
                } else {
                    System.out.println(smallK);
                }
            } else {
                if ( middleK > smallK ) {
                    System.out.println(middleK);
                } else {
                    System.out.println(smallK);
                }
            }
        }
 
        sc.close();
    }
}
