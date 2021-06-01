package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1 = "java"; // in string pool
        String word2 = "java"; // re-use from string pool

        String word3 = new String("java"); // create in HEAP, outside String Pool
        String word4 = new String("java"); // create in HEAP, outside String Pool

        System.out.println(word1 == word2); // true because both in the String pool
        System.out.println(word1 == word3); // false b/c word3 in the HEAP
        System.out.println(word3 == word4);  // false - point to different objects in heap

        System.out.println(word1.equals(word2)); // TRUE - COMPARING VALUES
        System.out.println(word1.equals(word3)); // TRUE - COMPARING VALUES
        System.out.println(word3.equals(word4)); // TRUE - COMPARING VALUES


    }
}
