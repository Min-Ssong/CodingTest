package BOJ.javaAlgo.before;

import java.util.Scanner;

public class boj21665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();
        int line = Integer.parseInt(lines.split(" ")[0]);
        int num = Integer.parseInt(lines.split(" ")[1]);
        String[][] oldArray = new String[line][num];
        String[][] newArray = new String[line][num];
        int count = 0;

        for ( int i = 0; i < line * 2 + 1; i++ ) {
            String temp = sc.nextLine();
            if ( temp.length() != 0 ) {
                for ( int j = 0; j < num; j++ ) {
                    if ( i < line ) {
                        if ( temp.split("")[j].equals("B") ) {
                            oldArray[i][j] = "W";
                        } else {
                            oldArray[i][j] = "B";
                        }
                    } else if ( i > line ) {
                        newArray[i-(line+1)][j] = temp.split("")[j];
                    }
                }
            }
        }

        for ( int i = 0; i < oldArray.length; i++ ) {
            for ( int j = 0; j < oldArray[i].length; j++ ) {
                if ( !(oldArray[i][j].equals(newArray[i][j])) ){
                    count += 1;
                }
            }
        }
        System.out.print(count);
        sc.close();
    }
}
