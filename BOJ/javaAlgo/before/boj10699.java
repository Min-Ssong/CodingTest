package BOJ.javaAlgo.before;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class boj10699 {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        String datestr = format.format(Calendar.getInstance().getTime());
        System.out.println(datestr);
    }
}