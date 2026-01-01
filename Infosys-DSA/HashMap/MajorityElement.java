package HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    public static void majorityElem(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Check majority element
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (map.get(key) > arr.length / 2) {
                System.out.println("Majority Element: " + key);
                return;
            }
        }

        System.out.println("No Majority Element");
    }

    public static void main(String[] args) {
      int[] arr = {1, 1, 1, 1, 2, 3, 4};
        majorityElem(arr);
    }
}
