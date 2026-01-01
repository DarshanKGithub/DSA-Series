package Test.Arrays;

public class countEvenAndOdd {
 
    public static void countEvenOdd(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("EvenCount: " + evenCount);
        System.out.println("OddCount: " + oddCount);
    }


    public static void main(String[] args) {
        int[] arr = {2,4,1,7,8,10,9,12,45,14,7};
        countEvenOdd(arr);
    }
}
