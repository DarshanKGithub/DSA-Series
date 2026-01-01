package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("US", 120);
        map.put("Germany", 150);
        map.put("Japan", 200);
        map.put("France", 500);

        Set<String> keys = map.keySet();
        System.out.print(keys);

        // for(String k : keys){
        //     System.out.println("Keys: "+ k + ", value: " + map.get(k));
        // }
        System.out.println(map.entrySet());
    }
    
}
