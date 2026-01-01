package Searching;

public class LinearSearch {

    static int linearSearch(int[] arr, int searchTarget){
        int size = arr.length ;
        for(int i = 0; i < size; i++ ){
            if(arr[i] == searchTarget){
                return i;
            }
        }
       return - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,3,6,9,0,15,78};
        int searchTarget = 0;
        System.out.println(linearSearch(arr,searchTarget));
    }
}
