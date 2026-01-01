package Arrays;

public class LargestNumberSmallest {
  
    public static int largestNumber(int[] arr){
        int largestSum = arr[0];
        

        for(int i = 1; i< arr.length; i++){
             if(arr[i] > largestSum){
                largestSum = arr[i];
                
             }
            }
            return largestSum;
        
    }

    public static int smallestNumber(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,9,3,1,0,12,88,100};
       int largeNumber = largestNumber(arr);
       int smallNumber = smallestNumber(arr);
       
       System.out.println("The largest number is: " + largeNumber);
       System.out.println("The smallest number is: " + smallNumber);
    }
}
