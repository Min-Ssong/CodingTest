package programmers;

import java.util.Arrays;

public class pr25 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        System.out.println(new StringBuilder(new String(temp)).reverse().toString());
    }
}
