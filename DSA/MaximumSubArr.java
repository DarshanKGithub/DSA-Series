package DSA;

public class MaximumSubArr {

    public static int maxSubArr(int[] arr){
        int curretSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            curretSum = Math.max(arr[i], curretSum + arr[i]);
            maxSum = Math.max(curretSum, maxSum);
        }
        return maxSum;

    }
 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(maxSubArr(arr));
    }

}
