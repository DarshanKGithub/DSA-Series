import java.util.Arrays;

public class AllZeroEnd {
    public static void moveZeroToEnd(int[] arr){
       int index = 0;
       Arrays.sort(arr);
        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        //fill remaining position with zer
        while(index < arr.length){
            arr[index++] = 0;
        }
        
    }

    public static void print(int[] arr){
       for(int n : arr){
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,0,7,8,9,3,6,9,0,4,2,0};
        moveZeroToEnd(arr);
        print(arr);
        
    }
}
