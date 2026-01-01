package Searching;

import java.util.Arrays;

public class BinarySearch {

    static int BinarySearch(int[] num, int target){
        int low = 0, high = num.length - 1;
        
        while(low <= high){
            int mid = low + (high  -  low) / 2;
            if(num[mid] == target) return mid;
            if(num[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return - 1;

    
    }

    public static void main(String[] args) {
        int[] num = {10,12,45,78,65,0,22};
        int target = 65;
        Arrays.sort(num);
        System.out.println(BinarySearch(num,target)); 
    }
}
