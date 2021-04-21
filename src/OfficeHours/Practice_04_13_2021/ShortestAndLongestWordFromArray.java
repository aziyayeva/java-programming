package OfficeHours.Practice_04_13_2021;
import java.util.*;

/**
 *Shortest and Longest words from String array
 •Write a program that can return the shortest string element from a String array
 •Write a program that can return the longest string element from a String array
 */

public class ShortestAndLongestWordFromArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you print:");
        String [] words = new String[input.nextInt()];
        input.nextLine(); // the reason for this one if will be the first value stored....

        for(int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i+1)); // this line prints (i+1) adds a number to the line)
            words[i] = input.nextLine(); // whatever you print on the scanner it will store the words to words[i]...

        }
        System.out.println(Arrays.toString(words)); // here we are printing an array [ **** ]
        //instead of doing this one below we can use (see line 26)
        // String [] smallAndLarge = new String[2]; // null, null
        String [] smallAndLarge = {words[0], words[0]};

        for (String eachWord : words) {
            if(eachWord.length() < smallAndLarge[0].length()){
                smallAndLarge[0] = eachWord;
            }
            if(eachWord.length() > smallAndLarge[1].length()) {
                smallAndLarge[1] = eachWord;
            }
        }
        System.out.println("Smallest element: " + smallAndLarge[0]);
        System.out.println("Largest element: " + smallAndLarge[1]);
        System.out.println(Arrays.toString(smallAndLarge)); // combined both smallest and largest strings from above
                                                            // and prints on the same line in [] array.


    }
}
