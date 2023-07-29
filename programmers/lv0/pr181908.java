public class pr181908 {
    public int solution(String my_string, String is_suffix) {        
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
    public static void main(String[] args) {
        pr181908 pr = new pr181908();
        pr.solution("banana", "ana");
    }
}