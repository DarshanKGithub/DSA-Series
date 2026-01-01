package Sorting;

public class BubbleSort {
  
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length - 1 - i; j++){
                if(arr[i] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0,8,7,6,3,2,1,4,9,20};
        bubbleSort(arr);

        for(int num : arr){
           System.out.print(num + " ");    
        }

    }
}
