package MaxandMinimum;

public class SecondLargestSmallest {
  
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if(num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }


    public static void main(String[] args) {
        int[] arr = {78,25,63,2,7,8,0,1,};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
}
