package Test.Arrays;

public class FindLargestandSmallestNumber{
  
    public static int findLargest(int[] arr){
        int max =Integer.MIN_VALUE;
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmalles(int[] arr){
        int min = Integer.MAX_VALUE;
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int arr[] = {100,78,65,0,36,9,87,5};
        System.out.println("Largest Number: "+(findLargest(arr)));
        System.out.println("Smallest Number: "+findSmalles(arr));
    }
}