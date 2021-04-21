package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 * You may modify and print the given array, or print a new array.
 *
 * input: 6, 2, 5, 3
 *
 * output: [2, 5, 3, 6]
 *
 */

public class LeftShiftedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Numbers: ");
            nums[i] = scan.nextInt();
        }

            int [] leftShiftedArray = new int [nums.length];
            leftShiftedArray[leftShiftedArray.length - 1] = nums[0];
                for( int i = 0; i < leftShiftedArray.length-1; i++ ) {
                    leftShiftedArray[i] = nums[i +1];
                }
            System.out.println(Arrays.toString(leftShiftedArray));

                }
        }

