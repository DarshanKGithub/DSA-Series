/*Find Duplciates

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.*/

package DSA;

public class FindDuplicates {

    // Bruteforce approach
    public static int duplicateNumber(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                       if(nums[i] == nums[j]){
                        return nums[i];
                       }
            }

        }
        return -1;
    }

    // public static int duplicateNumber(int[] arr){
    //     //Two pointer approach
    //     int slow = arr[0];
    //     int fast = arr[0];

    //     do{
    //         slow = arr[slow];
    //         fast = arr[arr[fast]];
    //     } while( slow != fast);

    //     slow = arr[0];
    //     while(slow != fast){
    //         slow = arr[slow];
    //         fast = arr[fast];
    //     }

    //     return slow;

    // }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2};
        System.out.println("Duplicate number is: "+duplicateNumber(nums));
    }
}
