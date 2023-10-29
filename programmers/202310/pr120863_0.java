package programmers;
public class pr120863_0 {
    class Solution {
        public String solution(String polynomial) {
            String[] poly = polynomial.split(" ");
            
            int solo = 0;
            int duo = 0;
            
            for(int i = 0; i < poly.length; i += 2) {
                String term = poly[i];
                if(term.endsWith("x")) {
                    duo += term.length() == 1 ? 1 : Integer.parseInt(term.substring(0, term.length() - 1));
                } else {
                    solo += Integer.parseInt(term);
                }
            }
            
            StringBuilder sb = new StringBuilder();
            if(duo != 0) {
                if(duo == 1) sb.append("x");
                else sb.append(duo).append("x");
            }
            if(solo != 0) {
                if(duo != 0) sb.append(" + ");
                sb.append(solo);
            }
            
            return sb.length() > 0 ? sb.toString() : "0";
        }
    }    
}