package programmers.none;

public class pr16 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        int rep = phone_number.length() - 4;
        System.out.println("*".repeat(rep) + phone_number.substring(rep, phone_number.length()));
    }
}
