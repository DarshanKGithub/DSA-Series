package Leetcode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] arr){
        int last = arr.length - 1;
        //traverse
        for(int i = last ; i >= 0; i--){

            //for last digit number
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }

            //edge case that if last digit is 9 then carry
            arr[i] = 0;
        }
        
        //if all digits were 9 create new array
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
       int[] ans = plusOne(arr);
       System.out.println(Arrays.toString(ans));
    }
}
