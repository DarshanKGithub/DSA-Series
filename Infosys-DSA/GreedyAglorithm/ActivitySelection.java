/*Activity Selection:
  Your are given n activities with thier start and end times. Select the maximum numbers of activites that 
  can be perfromed by a single person, asuuming that a person can only work on a single activity at a time.
  Activities are sorted according to the end time

*/
import java.util.*;

public class ActivitySelection{
    public static void main(String[] args) {
        //Avitivity have their Start and End Time
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //End time is sorted
        int maxAcc = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAcc = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1; i < end.length; i++){
            if(start[i] >= lastEnd){

                maxAcc++;
                ans.add(i);
                lastEnd = end[i];
            }

        }
        System.out.println("Max acitivies = " + maxAcc);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i)+" ");
        }
        System.out.println();
    }

    

}