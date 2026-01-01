package Arrays;

public class Basics {
     public static void update(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
     }

     public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
        int[] arr = {2,4,8,6,2,4,0,7};
        update(arr);
        print(arr);
    }
}
