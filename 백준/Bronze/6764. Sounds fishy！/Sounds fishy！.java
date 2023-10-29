import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deptA = sc.nextInt();
        int deptB = sc.nextInt();
        int deptC = sc.nextInt();
        int deptD = sc.nextInt();
        int deptAB = deptA - deptB;
        int deptBC = deptB - deptC;
        int deptCD = deptC - deptD;

        if( deptAB < 0 && deptBC < 0 && deptCD < 0 ) {
            System.out.println("Fish Rising");
        } else if ( deptAB > 0 && deptBC > 0 && deptCD > 0 ) {
            System.out.println("Fish Diving");
        } else if ( deptAB == 0 && deptBC == 0 && deptCD == 0 ) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
        sc.close();
    }
}
