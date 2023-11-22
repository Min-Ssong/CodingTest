import java.time.LocalDate;

public class Solution {
    public static String solution(int a, int b){
        return String.valueOf(LocalDate.of(2016, a, b).getDayOfWeek()).substring(0, 3);
    }   
}