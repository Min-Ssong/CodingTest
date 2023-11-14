import java.util.ArrayList;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] locDog = new int[2];
        int width = park[0].length();
        int height = park.length;
        char[][] map = new char[height][width];

        for (int i = 0; i < height; i++) {
            map[i] = park[i].toCharArray();
            if (park[i].indexOf('S') != -1) {
                locDog[0] = i;
                locDog[1] = park[i].indexOf('S');
            }
        }

        for (String route : routes) {
            String[] command = route.split(" ");
            String dir = command[0];
            int point = Integer.parseInt(command[1]);
            int[] beforeDog = {locDog[0], locDog[1]};

            for (int j = 1; j <= point; j++) {
                switch (dir) {
                    case "E": locDog[1] += 1; break;
                    case "W": locDog[1] -= 1; break;
                    case "N": locDog[0] -= 1; break;
                    case "S": locDog[0] += 1; break;
                }
                if (locDog[0] < 0 || locDog[0] >= height ||
                    locDog[1] < 0 || locDog[1] >= width ||
                    map[locDog[0]][locDog[1]] == 'X') {
                    locDog[0] = beforeDog[0];
                    locDog[1] = beforeDog[1];
                    break;
                }
            }
        }
        return locDog;
    }
}
