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

        String floatStr = String.valueOf(resultPrice * roomPrice);
        if( floatStr.indexOf(".") != -1 ) {
            String underFloatStr = floatStr.substring(floatStr.indexOf(".")+1, floatStr.length()).trim();
            
            if( Integer.parseInt(underFloatStr) > 0 ) {
                System.out.println(resultPrice * roomPrice);
            } else {
                System.out.println(floatStr.substring(0, floatStr.indexOf(".")));
            }
        }
        sc.close();
    }
}
