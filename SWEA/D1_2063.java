package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int[] nums = new int[T];
		for(int test_case = 1; test_case <= T; test_case++) {
            nums[test_case - 1] = sc.nextInt();
		}
        Arrays.sort(nums);
        System.out.print(nums[T / 2]);
        sc.close();
    }
}