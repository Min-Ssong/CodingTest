package BOJ.javaAlgo.before;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class boj5613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(br.readLine());
        List<String> flag = new ArrayList<String>();
        List<Integer> num = new ArrayList<Integer>();
        while ( true ) {
            String str = br.readLine();
            if ( str.equals("=") ) {
                for ( int i = 0; i < num.size(); i++ ) {
                    if ( flag.get(i).equals("+") ) {
                        firstNum += num.get(i);
                    } else if ( flag.get(i).equals("-") ) {
                        firstNum -= num.get(i);
                    } else if ( flag.get(i).equals("*") ) {
                        firstNum *= num.get(i);
                    } else if ( flag.get(i).equals("/") ) {
                        firstNum /= num.get(i);
                    }
                }
                System.out.print(firstNum);
                break;
            }

            if ( str.equals("+") || str.equals("-") 
                || str.equals("*") || str.equals("/")) {
                flag.add(str);
            } else {
                num.add(Integer.parseInt(str));
            }
        }
        br.close();
    }
}
