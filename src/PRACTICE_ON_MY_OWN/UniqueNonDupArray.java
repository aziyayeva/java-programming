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

public class UniqueNonDupArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type 7 numbers");
        int[] nums = {input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0; //how many times first element showed up

        for(int i = 0; i<nums.length; i++) {

            for (int eachNum : nums) { // nums - array value
                if (eachNum == nums[0]) { // gives you the count of the first item  2 2 1 5 5 4 8 ==> first 2 items are the same "2".
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
