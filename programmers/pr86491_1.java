package programmers;

// 230914 CT PR 1 86491 : 최소직사각형
public class pr86491_1 {
	public static void main(String[] args) throws Exception{
		solution(new int[][]{{60,50},{30,70},{60,30},{80,40}});
		solution(new int[][]{{10,7},{12,3},{8,15},{14,7},{5,15}});
		solution(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}});
	}
	// w compare h and wMax * hMax
	public static int solution(int[][] sizes){
		int wMax = Integer.MIN_VALUE;
		int hMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < sizes.length; i++){
			if(sizes[i][0] > sizes[i][1]){
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
			
			if(sizes[i][0] > wMax) wMax = sizes[i][0];
			if(sizes[i][1] > hMax) hMax = sizes[i][1];
		}
		
		return wMax * hMax;
	}
}