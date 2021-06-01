package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {

      //  printStrList(Arrays.asList("java", "I", "love" ));

        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium"); words.add("a"); words.add("input"); words.add("title");
        System.out.println(words);
        printStrList(words);

    }
    public static void printStrList (List<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();

        List<Integer> nums = Arrays.asList(2, 5, 1, 8);

    }

    public static int sumIntegerList (List<Integer> integerList) {
        int sum = 0;
        for(int each : integerList){
            sum += each;
        }
        return sum;

    }

}
