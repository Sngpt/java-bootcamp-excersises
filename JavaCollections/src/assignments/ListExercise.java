package assignments;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList(Arrays.asList(1,2,3,4,5));

        int sum = 0;
        for(Integer i : l) {
           sum = sum+i;
        }
        System.out.println("Sum of integers:"+sum);
    }

}
