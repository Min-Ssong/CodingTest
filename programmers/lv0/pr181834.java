package programmers.lv0;

public class pr181834 {
    public String solution(String myString) {
        return myString.replaceAll("[a-k]", "l");

        // char[] chars = myString.toCharArray();
        // for (int i = 0; i < chars.length; i++) {
        //     if (chars[i] <= 'k') 
        //         chars[i] = 'l';
        // }
        // return new String(chars);
    }
}
