package BOJ.javaAlgo;

import java.util.Scanner;

public class boj3512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allRoomNum = sc.nextInt();
        int roomPrice = sc.nextInt();
        float[] result = new float[2];

        float resultPrice = 0.0f;

        for( int i = 0; i < allRoomNum; i++ ) {
            float roomNum = sc.nextFloat();
            String roomName = sc.next();
            result[0] += roomNum;

            if( roomName.equals("bedroom") ) {
                result[1] += roomNum;
            } 
            
            if ( roomName.equals("balcony") ) {
                resultPrice += roomNum/2;
            } else {
                resultPrice += roomNum;
            }
        }
        System.out.println((int)result[0]);
        System.out.println((int)result[1]);
        System.out.printf("%.6f", resultPrice * roomPrice);
        
        sc.close();
    }
}