/*
Problem Statement: Given an array of Size N, an array is considered a summer array
if all even values are on one side and all odd values are on other side.you can
swapa adjacent elements.Return the miniumum number of adjacent swaps requried 
to make the array a summer array

*/

package Test;

public class MinimumSwapOddEven {

    private static long countSwap(int arr[] , boolean evenOnLeft){
         long swaps = 0;
        int targetPos = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isEven = arr[i] % 2 == 0;

            if ((evenOnLeft && isEven) || (!evenOnLeft && !isEven)) {
                swaps += i - targetPos;
                targetPos++;
            }
        }
        return swaps;
    }


    public static long minAdjacentSwaps(int[] arr){
        long evenLeft = countSwap(arr,true);
        long oddLeft = countSwap(arr, true);

        return Math.min(evenLeft, oddLeft);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,6};
        System.out.println(minAdjacentSwaps(arr));
    }
}
