import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sumGrade = 0;
        double avg = 0.0;
        for (int i = 0; i < 20; i++){
            String[] inputString = br.readLine().split(" ");
            double credit = Double.parseDouble(inputString[1]);
            String grade = inputString[2];

            if( !"P".equals(grade) ){
                sumGrade += credit;
                switch (grade) {
                    case "A+": avg += (credit * 4.5); break;
                    case "A0": avg += (credit * 4.0); break;
                    case "B+": avg += (credit * 3.5); break;
                    case "B0": avg += (credit * 3.0); break;
                    case "C+": avg += (credit * 2.5); break;
                    case "C0": avg += (credit * 2.0); break;
                    case "D+": avg += (credit * 1.5); break;
                    case "D0": avg += (credit * 1.0); break;
                    case "F" : avg += (credit * 0.0); break;
                }
            }
        }
        System.out.printf("%.6f", avg/sumGrade);
    }
}