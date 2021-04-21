package PRACTICE_ON_MY_OWN;

import java.util.Arrays;

/**
 * Implement the do_switch method
 * Switch the last element in an array with the first and return the array.
 *
 * Examples:
 *
 * do_switch([1,2,3,4])
 *
 * returns:[4,2,3,1]
 * do_switch([1,2,3,4])
 *
 * returns:[4,2,3,1]
 * do_switch([7,2,3,5])
 *
 * returns:[5,2,3,7]11
 */

public class do_switch_method_replit {
    public static void main(String[] args) {
        int [] newNum = {2, 5, 8, 9};
        System.out.println(Arrays.toString(newNum));
        do_switch(newNum);
        System.out.println();
        System.out.println(Arrays.toString(newNum));
        System.out.println(Arrays.toString(do_switch(new int[] {2, 5, 4, 8})));

    }

    public static int[] do_switch(int[] i) {
        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;



    }
}
