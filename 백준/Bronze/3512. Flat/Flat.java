import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String allInput = br.readLine();
        int len = Integer.parseInt(allInput.split(" ")[0]);
        Double price = Double.parseDouble(allInput.split(" ")[1]);
        int allWidth = 0;
        int bedRoomWidht = 0;
        Double balconyWidth = 0.0;
        for ( int i = 0; i < len; i++ ){
            String roomInfo = br.readLine();
            int roomWidth = Integer.parseInt(roomInfo.split(" ")[0]);
            String roomName = roomInfo.split(" ")[1];

            allWidth += roomWidth;
            if ( roomName.equals("bedroom") ) {
                bedRoomWidht += roomWidth;
            }else if ( roomName.equals("balcony") ) {
                balconyWidth += Double.parseDouble(String.valueOf(roomWidth)) / 2;
            }
        }
        System.out.printf("%d\n%d\n",
            allWidth,
            bedRoomWidht
        );
        System.out.println(price * (Double.parseDouble(String.valueOf(allWidth)) - balconyWidth));
        br.close();
    }
}