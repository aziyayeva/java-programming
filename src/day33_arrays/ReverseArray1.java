package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {

    // indexes       1   2   3   4
        int[] nums = {5, 10, 4, 100}; // original array with 4 numbers
        int[] numsRev = new int [nums.length]; /// declare new array with the same length {0, 0, 0, 0}
       // int [] numRev = {0,0,0,0}; /// by Default all values are 0 when declared

         //        i = 3           j = 0
        for(int i = nums.length-1, j = 0; i >= 0; i--, j++) {
           // System.out.print(nums[i] + " ");
            numsRev[j] = nums[i];

            }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));

        }

    }


