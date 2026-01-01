package MaxandMinimum;

public class MaxandMin {

    public static int max(int[] arr){
        int maxArr = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxArr){
                maxArr  = arr[i];
            }
        }
        return maxArr;
    }

    public static int min(int[] arr){
        int minArr = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minArr){
                minArr = arr[i];
            }
        }
        return minArr;
    }

    public static void main(String[] args) {
        int[] arr = {78,25,63,2,7,8,0,1,};
        System.out.println("Maxiumum Element: "+ max(arr));
        System.out.println("Minimum Element: "+ min(arr));
    }
}