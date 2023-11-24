import java.util.*;

public class Solution {
    public static int solution(int[] bandage, int health, int[][] attacks){
        int coolTime = bandage[0];
        int hill     = bandage[1];
        int overHill = bandage[2];
        int continueTime = 0;
        int changeHealth = health;
        int j = 0;
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if(i == attacks[j][0]){
                changeHealth -= attacks[j][1];
                if(changeHealth <= 0) return -1;
                continueTime = 0;
                j++;
                continue;
            }
            continueTime += 1;
            if(changeHealth < health){
                if(continueTime == coolTime){
                    changeHealth += overHill + hill;
                    continueTime = 0;
                } else {
                    changeHealth += hill;
                }
                if(changeHealth > health) changeHealth = health;
            }
        }
        return changeHealth;
    }
    
}