package day33_arrays;

import java.util.Arrays;

public class ReverseArrays2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //
              //      0  1   2   3
        int[] nums = {5, 10, 4, 100};
        System.out.println("Before swap: " + Arrays.toString(nums));

        System.out.println("before: " + Arrays.toString(nums));

        int [] nums2 = {5, 10, 4, 100};
        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
            System.out.println("After the swap: " + Arrays.toString(nums2));

        }
        System.out.println("******************************");
            //index         0        1      2     3       4
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));





    }
}
