package BOJ.javaAlgo.before;

import java.io.*;
import java.util.Arrays;

public class boj2997 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int[] nums = {
            Integer.parseInt(allInput.split(" ")[0]),
            Integer.parseInt(allInput.split(" ")[1]),
            Integer.parseInt(allInput.split(" ")[2])
        };
        Arrays.sort(nums);
        if ( nums[1] - nums[0] == nums[2] - nums[1] ) {
            System.out.print((nums[2] - nums[1]) + nums[2]);
        } else {
            System.out.printf("%d",
                ( nums[1] - nums[0] > nums[2] - nums[1] ) 
                    ? (nums[2] - nums[1]) + nums[0]
                    : (nums[1] - nums[0]) + nums[1]
            );
        }
        
        br.close();
    }
}
