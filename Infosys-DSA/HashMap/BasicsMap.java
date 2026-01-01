package HashMap;

import java.util.*;

public class BasicsMap {
    public static void main(String[] args) {
        //Created Hashmap
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion O(1)
        map.put("India", 120);
        map.put("China", 150);
        map.put("Japan", 100);
        System.out.println(map);

        //Get O(1)
        // System.out.println(map.get("India"));
        // System.out.println(population);

        //ContainsKey
        // System.out.println(map.containsKey("India"));

        //Remove
        System.out.println(map.remove("China"));
        System.out.println(map);

        //Size
        System.out.println(map.size());

        //isEmpty
        // map.clear();
        System.out.println(map.isEmpty());


    }
}
