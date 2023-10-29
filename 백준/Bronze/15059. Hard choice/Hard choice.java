import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String foodPool = br.readLine();
        String[] foodPools = foodPool.split(" ");

        String inputFood = br.readLine();
        String[] inputFoods = inputFood.split(" ");

        int result = 0;
        for ( int i = 0; i < foodPools.length; i++ ) {
            result += ( Integer.parseInt(inputFoods[i]) > Integer.parseInt(foodPools[i]) ) 
                ? Integer.parseInt(inputFoods[i]) - Integer.parseInt(foodPools[i]) : 0;
        }
        System.out.print(result);

        br.close();
    }
}
