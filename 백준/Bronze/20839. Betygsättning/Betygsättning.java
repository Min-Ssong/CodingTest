import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String standard = br.readLine();
        Double[] standardInt = { 
            Double.parseDouble(standard.split(" ")[0]),
            Double.parseDouble(standard.split(" ")[1]),
            Double.parseDouble(standard.split(" ")[2])
        };
        String num = br.readLine();
        Double[] numInt = {
            Double.parseDouble(num.split(" ")[0]),
            Double.parseDouble(num.split(" ")[1]),
            Double.parseDouble(num.split(" ")[2])
        };

        if ( standardInt[0] <= numInt[0] && standardInt[1] <= numInt[1] && standardInt[2] <= numInt[2] ) {
            System.out.println("A");
        } else if ( standardInt[1] <= numInt[1] && standardInt[2] <= numInt[2] ) {
            System.out.println( (standardInt[0]/2 <= numInt[0]) ? "B" : "C" );
        } else if ( standardInt[2] <= numInt[2] ) {
            System.out.println( (standardInt[1]/2 <= numInt[1]) ? "D" : "E" );
        }

        br.close();
    }
}
