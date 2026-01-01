package Arrays;

public class LinearSearch {
    
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

  

    public static void main(String[] args) {
        int[] arr = {2,4,8,6,0,3,9,8,7};
        int target = 3;
        int index = linearSearch(arr,target);

        //Base Case
        if(index == -1){
            System.out.println("Not found");
        } else{
            System.out.println("Found on the index: " + index);
        }
    }
}
