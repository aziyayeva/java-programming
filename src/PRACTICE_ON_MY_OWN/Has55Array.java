package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array.
 * If no consecutive 5s or no 5s are detected in your code then print false.
 */

public class Has55Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        boolean has55 = false;

        for(int i = 0; i < nums.length - 1; i++ ) {
            if(nums[i] == 5 && nums[i + 1] == 5) {
                has55 = true;
                break;

            }
            }
        System.out.println(has55);
            }

        }

