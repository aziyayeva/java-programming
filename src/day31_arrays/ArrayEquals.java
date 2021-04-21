package day31_arrays;
import java.util.*;

public class ArrayEquals {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("nums1 == nums2 - " + Arrays.equals(nums1, nums2));
        System.out.println(nums1 == nums2); //not checking the same values, this is checking if point to same object in memory
        System.out.println("nums2 == nums3 - " + Arrays.equals(nums2, nums3)); // order is not matching

        if(Arrays.equals(nums2, nums4)) {
            System.out.println("nums2 and nums4 match");
        } else {
            System.out.println("not matching");
        }
        System.out.println("cars1 == cars2 - " + Arrays.equals(cars1, cars2));
        System.out.println("cars2 == cars3 - " + Arrays.equals(cars2, cars3));







    }
}
