package OfficeHours.Practice_05_10_2021;

import java.util.ArrayList;

public class SeparateCharactersUsingMethods {
    public static void main(String[] args) {

        String str = "ABCD123$%#$%456EFG";
        separateParts(str);
        System.out.println("Arraylist inside ArrayList: " + str);


    }
    public static ArrayList<ArrayList<Character>> separateParts(String str) {

        //[ [letters], [digits], [special] ]
        ArrayList<ArrayList<Character>> all = new ArrayList<>(); // ArrayList of Characters

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        all.add(letters);
        all.add(digits);
        all.add(special);

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)) {
                all.get(0).add(eachChar);
            } else if(Character.isDigit(eachChar)) {
                all.get(1).add(eachChar);
            } else {
                all.get(3).add(eachChar);
            }
        }
        return all;


//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());
//        all.add(new ArrayList<>());
    }
}
