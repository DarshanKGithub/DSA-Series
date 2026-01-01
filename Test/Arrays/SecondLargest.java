package Test.Arrays;

public class SecondLargest {
   
    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax= max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int arr[] = {100,78,65,0,36,9,87,5};
        System.out.println(secondLargest(arr));
    }
}
