package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Given an array nums with 7 integers every element is repeated twice - except one.
 * Find that element and print it to console.
 *
 * Example:
 *
 * nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */


public class ArrayFindNonDuplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type 7 numbers");
        int[] nums = {input.nextInt(), input.nextInt(),
                input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};

        int nonDuplicate = nums [0];
        int count = 0;

        for(int eachNum : nums) {
          //  count = 0;

             for( int i = 0; i < nums.length; i++) {
                 if(eachNum == nums[i] ) {
                     count++;
                 }
             }
            if( count == 1 ) {
                nonDuplicate = eachNum;
                break;
            }
         }
        System.out.println("Unique Character: " + nonDuplicate);

    }
}
