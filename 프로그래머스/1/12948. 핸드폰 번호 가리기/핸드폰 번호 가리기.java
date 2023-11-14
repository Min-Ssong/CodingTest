class Solution {
    public String solution(String phone_number) {
        int rep = phone_number.length()-4;
        return "*".repeat(rep) + phone_number.substring(rep, phone_number.length());
    }
}