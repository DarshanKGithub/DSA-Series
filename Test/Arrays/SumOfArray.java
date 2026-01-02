package Test.Arrays;

public class SumOfArray {
  
  public static void sumOfArray(int[] arr){
    int sum = 0; 
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }

    System.out.println("Sum: " + sum);
  }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,6,3,0,5};
        // System.out.println(sumOfArray(arr));
        sumOfArray(arr);
    }
}
