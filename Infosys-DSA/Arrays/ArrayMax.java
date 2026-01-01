package Arrays;
/* Your are given integer n. A O-indexed integer array nums of length n+1 is generated following rules:
1.nums[0] = 0;
2.nums[1] = 1;
3.nums[2*i] = nums[i] , when 2<=2*i <=n
4.nums([2*i] + 1) <= n =nums[i] + nums[i + 1], when 2<=2*i+1 <=n
Return the maximum integer in the arrays nums

*/

public class ArrayMax {

    static void findArrayMax(int n, int[] arr){
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 1; i <= n/2;i++){
            arr[i * 2] = arr[i];
            if((i*2) + 1 <=n){
                arr[(i * 2) + 1] = arr[i] + arr[i+1];

            }
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

     public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n + 1];
        
        findArrayMax(n,arr);
     } 
}
