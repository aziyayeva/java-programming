package day31_arrays;
import java.util.Arrays; // or import java.util.*; --> import everything
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        // print all nums in the same line
        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("Min Value: " + nums[0]); // will give you min number
        System.out.println("Max Value: " + nums[nums.length-1]); // will give you the max Array Value without counting

        String [] words = {"Java" , "Python", "C++", "Sql", "Ruby", "Javascript"};
        System.out.println(Arrays.toString(words)); // print String in one line
        System.out.println("[" + String.join(", ", words) + "]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println("");

        //sort in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
