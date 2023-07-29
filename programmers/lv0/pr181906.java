public class pr181906 {
    public int solution(String my_string, String is_prefix) {
        int a = my_string.indexOf(is_prefix);
        return a == 0? 1 : 0;
    }

    public static void main(String[] args) {
        pr181906 p = new pr181906();
        System.out.println(p.solution("banana", "ban"));
        System.out.println(p.solution("banana", "nan"));
        System.out.println(p.solution("banana", "abcd"));
        System.out.println(p.solution("banana", "bananan"));
    }
}
