import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> studentMap = new HashMap<String, Integer>();
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreElements()) studentMap.put(st.nextToken(), 0);
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreElements()){
                String key = st.nextToken();
                int value = studentMap.get(key);
                studentMap.put(key, ++value);
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(studentMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               int nameCompare = o2.getValue().compareTo(o1.getValue());
               return nameCompare != 0 ? nameCompare : o1.getKey().compareTo(o2.getKey());
           }
        });
        
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        for(Entry<String, Integer> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
     }
}