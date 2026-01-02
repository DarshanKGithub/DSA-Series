package SlidingWindow;

public class MaxSubArrySumK {

    public static int maxSum(int[] arr, int k, int n){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n - k + 1; i++){
            for(int j = 0; j < k; j++){
                currentSum += arr[i + j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,8,7,1};
        int k = 3; // Nothing but Window size
        int n = arr.length;

        System.out.println(maxSum(arr,k,n));
        
    }
    
}
