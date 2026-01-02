package DSA;

import java.util.Arrays;

public class ProuctOfArrayExceptItself {

    public static int[] productOfArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    prod *= arr[j];
               
                }
            }
            result[i] = prod;
        
        }
        return result;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       int[] ans = productOfArrayExceptSelf(arr);
       System.out.println(Arrays.toString(ans));
    }
}
