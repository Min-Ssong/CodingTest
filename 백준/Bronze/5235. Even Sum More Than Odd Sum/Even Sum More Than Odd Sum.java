import java.util.Scanner;

public class Main {

    private static int checkEvenSumMoreThanOddSum(int[] sequence) {
        int ret = 0;
        int countEven = 0;
        int countOdd = 0;
        for ( int i = 0; i < sequence.length; i++ ) {
            if ( sequence[i] % 2 == 0 ) {
                countEven += sequence[i];
            } else {
                countOdd += sequence[i];
            }
        }
        if ( countEven > countOdd ) {
            ret += 1;
        } else if ( countEven < countOdd ) {
            ret += -1;
        }
        return ret;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int lengthOfSequence = sc.nextInt();

            int [] sequence = new int[lengthOfSequence];

            for(int j = 0; j < lengthOfSequence; j++) {
                sequence[j] = sc.nextInt();
            }

            int res = checkEvenSumMoreThanOddSum(sequence);
            if(res > 0) {
                System.out.println("EVEN");
            } else {
                if(res < 0) {
                    System.out.println("ODD");
                } else {
                    System.out.println("TIE");
                }
            }
        }
    }
}

