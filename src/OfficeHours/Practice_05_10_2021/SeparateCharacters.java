package OfficeHours.Practice_05_10_2021;

import java.util.ArrayList;

public class SeparateCharacters {
    public static void main(String[] args) {

        String str = "ABCD123$%#$%456EFG";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)) {
                letters.add(eachChar);
            } else if(Character.isDigit(eachChar)) {
                digits.add(eachChar);
            } else {
                special.add(eachChar);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);
    }
}
