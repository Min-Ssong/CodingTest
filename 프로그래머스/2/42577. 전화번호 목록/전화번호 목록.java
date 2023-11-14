import java.util.Arrays;

class Solution {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);  // 전화번호를 사전순으로 정렬

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 인접한 전화번호만 확인하면 됨
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
