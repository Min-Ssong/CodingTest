package BOJ.javaAlgo.before;

import java.io.*;

public class boj16199 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myBirthday = br.readLine();
        String preDate = br.readLine();
        int myYear = Integer.parseInt(myBirthday.split(" ")[0]);
        int myMonth = Integer.parseInt(myBirthday.split(" ")[1]);
        int myDay = Integer.parseInt(myBirthday.split(" ")[2]);
        int preYear = Integer.parseInt(preDate.split(" ")[0]);
        int preMonth = Integer.parseInt(preDate.split(" ")[1]);
        int preDay = Integer.parseInt(preDate.split(" ")[2]);
        int age = preYear - myYear;

        if(myYear == preYear) {
			System.out.println(age);
		}else{
			if(myMonth > preMonth) {
				System.out.println(age - 1);
			}else if(myMonth == preMonth){
				if(myDay <= preDay) {
					System.out.println(age);
				}else {
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.print(age);

        br.close();
    }
}