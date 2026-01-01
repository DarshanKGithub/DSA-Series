package Sorting;

public class SelectionSort{
 
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,0,7,8,9,3,0,12,11,25,36,50};
        selectionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}