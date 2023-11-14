import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> strMap = new HashMap<String, Integer>();		
		for(int i = 0; i < players.length; i++){
			strMap.put(players[i], i+1);
		}
		
		for(int i = 0; i < callings.length; i++){
			int num = strMap.get(callings[i]);
			
			strMap.put(players[num-2], strMap.get(players[num-2]) + 1);	
			strMap.put(callings[i], num-1);
			
			String temp = players[num - 1];
			players[num - 1] = players[num - 2];
			players[num - 2] = temp;
		}
        
        return players;
    }
}