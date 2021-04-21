package day32_arrays_splits;
import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
            //            0    1      2       3
        String words = "java:python:selenium:html";
        String []  wordArray = words.split(":");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("Length of Array: " + wordArray.length);


        String sentence = "today I am coding java arrays";
        String [] wordsInSentence = sentence.split(" ");
        System.out.println("first word: " + wordsInSentence[0]);

        System.out.println("Number of total characters: " + sentence.length()); // 29 characters.... count starts with 1
        System.out.println("first word: " + sentence.split(" ")[0] ); // first word of the string

        //each word in a separate line
        for(String each : wordsInSentence) {
            System.out.println(each);
        }


    }
}
