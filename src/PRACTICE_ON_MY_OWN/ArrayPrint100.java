package PRACTICE_ON_MY_OWN;

import java.util.Arrays;

/**
 * 1. Create an int array called numbers that has length of 100
 * 2. Assign 1-100 to each index of the array.  Then use a for each loop to print out all the elements of the array
 */

public class ArrayPrint100 {
    public static void main(String[] args) {

        int [] numbers = new int [100]; // declared new size of array
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] += i + 1;

        }
        System.out.print(Arrays.toString(numbers));
    }


    }

