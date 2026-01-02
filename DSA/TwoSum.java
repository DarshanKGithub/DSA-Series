/*
Check if pair with the given sum exist in Array;
*/

package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Brute Force approach
    // public static int[] twoSum(int[] arr, int target){
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = i + 1; j < arr.length; j++){

    //             if(arr[i] + arr[j] == target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    //optimal approach
   public static int[] twoSum(int[] arr, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++){
        int complement = target - arr[i];
         if(map.containsKey(complement)){
            return new int[]{map.get(complement), i};
        }
        map.put(arr[i], i);
    }
    return new int[]{-1,-1};
   }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,0};
        int target = 11;
        int[] result = twoSum(arr, target);
        // System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
}
