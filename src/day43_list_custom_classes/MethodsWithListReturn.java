package day43_list_custom_classes;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.ArrayList;
import java.util.List;

/**
 * No params
 * getIntegerList
 * return List<Integer>
 */

/*
    This class contains Arrays and ArrayList, also calculations between those two, what runs faster.....
    Here we are calling Methods with return
 */

public class MethodsWithListReturn {
    public static void main(String[] args) {

        long start = System.nanoTime(); // 1 sec = 1_000_000_000 nanoseconds
        List<Integer> mlnNums = getIntegerList();// returns ready ArrayList object...no need to create new ArrayList
        long end = System.nanoTime();
       // System.out.println(mlnNums);
        System.out.println("ArrayList time: " + (end - start));

        long startArray = System.nanoTime();
        int [] millionNum = getIntegerArray();
        long endArray = System.nanoTime();
       // System.out.println(millionNum);
        System.out.println("Array time: " + (endArray - startArray));

    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray(){
        //declare new array with 1 000 000
        int [] nums = new int [1_000_001];
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i]  = i;
        }
        return nums;
    }
}

