package BOJ.javaAlgo.before;

import java.io.*;

public class boj5157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String result = "";
        for ( int i = 0; i < K; i++ ) {
            String CBnr = br.readLine();
            int C = Integer.parseInt(CBnr.split(" ")[0]);
            int B = Integer.parseInt(CBnr.split(" ")[1]);
            int n = Integer.parseInt(CBnr.split(" ")[2]);
            Double r = Double.parseDouble(CBnr.split(" ")[3]) / 100;

            String nums = br.readLine();
            String[] num = nums.split(" ");
            Double resultDouble = 0.0;

            for ( int j = 0; j < n; j++ ) {
                String money = br.readLine();
                String comNum = money.split(" ")[0];
                Double comMoney = Double.parseDouble(money.split(" ")[1]);
                for ( int k = 0; k < num.length; k++ ) {
                    if ( num[k].equals(comNum) ) {
                        resultDouble += Math.floor(comMoney * r);
                    }
                }
            }
            result += "Data Set "+(i+1)+": \n"+(int)Math.round(resultDouble)+"\n\n";
        }
        System.out.print(result);
        br.close();
    }
}
