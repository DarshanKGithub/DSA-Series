package MaxandMinimum;

import java.util.Arrays;

public class findKthElement {

    public static int kthLargestElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static int kthSmallestElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
         int[] arr = {78,25,63,2,7,8,0,1,};
         int k = 4;
         System.out.println("Kth Largest Element: " + kthLargestElement(arr,k));
         System.out.println("Kth Smallest Element: " + kthSmallestElement(arr,k));
    }
}
