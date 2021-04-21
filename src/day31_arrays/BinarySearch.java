package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        //              0  1    2    3    4       5    6     --> index
        int [] nums = {-5, 23, 123, 654, 12345, 14421, 1};
        System.out.println(Arrays.binarySearch(nums, 23)); //0
        System.out.println(Arrays.binarySearch(nums, 12345)); //4
        System.out.println(Arrays.binarySearch(nums, 25)); // -3
        System.out.println(Arrays.binarySearch(nums, 700)); // -5
        System.out.println(Arrays.binarySearch(nums, -5)); // 0
        System.out.println(Arrays.binarySearch(nums, 1)); // -2

        //check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is NOT present in array");
        }



    }
}
