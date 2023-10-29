import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(i, age, name);
        }
        
        // 정렬
        Arrays.sort(members, new Comparator<Member>() {
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return m1.joinOrder - m2.joinOrder; // 가입한 순서대로
                } else {
                    return m1.age - m2.age; // 나이 순으로
                }
            }
        });
        
        // 출력
        for (int i = 0; i < N; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }
    }
}

class Member {
    int joinOrder;
    int age;
    String name;
    
    Member(int joinOrder, int age, String name) {
        this.joinOrder = joinOrder;
        this.age = age;
        this.name = name;
    }
}
