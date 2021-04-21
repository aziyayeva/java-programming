package day22_string_manipulation;

import java.sql.SQLOutput;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "noon"; // reverse the word java...
        System.out.print(word.charAt(3));// a (println)  --- to print on the same line use print(no ln)
        System.out.print(word.charAt(2));// v ---
        System.out.print(word.charAt(1));// a ---
        System.out.println(word.charAt(0));// j ---
        System.out.println(word);
        System.out.println("");

        // print using single statement and concat +
        // if you do not use "" in concatanation your charAt(numbers) will be added through Ascii table
        // adding "" makes the statement
        System.out.println(word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));

        String reverse = "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reverse = " + reverse);

        if(word.equalsIgnoreCase(reverse)) {
            System.out.println("palindrome word");

        } else {
            System.out.println("not palindrome word");

        }


    }
}
