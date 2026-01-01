package MaxandMinimum;

import java.util.PriorityQueue;
import java.util.*;

public class usingHeap {

   public static int heapMax(int[] arr, int k){
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for(int num : arr){
     maxHeap.offer(num);
     if(maxHeap.size() > k){
        maxHeap.poll();
     }    
    }
    return maxHeap.peek();
}

    public static void main(String[] args) {
        int[] arr = {78,25,63,2,7,8,0,1,};
        int k = 4;

        System.out.println("Using Heap Max Value: "+ heapMax(arr,k) );
    }
}
