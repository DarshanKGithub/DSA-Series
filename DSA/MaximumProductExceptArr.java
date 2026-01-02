package DSA;

public class MaximumProductExceptArr {

    public static int maximumProdExcept(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < 0){
              int temp = max;
              max = min;
              min = temp;

            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            result = Math.max(result, max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,-9,6,-1,0,4};
        System.out.println(maximumProdExcept(arr));
    }
}
