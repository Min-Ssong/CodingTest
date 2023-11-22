public class Solution {
    public static int[] solution(String[] wallpaper){
        int xx = Integer.MAX_VALUE;
        int xy = Integer.MAX_VALUE;
        int yx = Integer.MIN_VALUE;
        int yy = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                int firSharp = wallpaper[i].indexOf("#");
                int lastSharp = wallpaper[i].lastIndexOf("#");
                if(i < xy) xy = i;
                if(i > yy) yy = i;
                if(firSharp < xx) xx = firSharp;
                if(lastSharp > yx) yx = lastSharp;
            }
        }
        int[] answer = {xy, xx, yy+1, yx+1};
        return answer;
    }
    
}