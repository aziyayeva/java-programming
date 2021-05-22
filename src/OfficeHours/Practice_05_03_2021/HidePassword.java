package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hide Password
 * Given an array of passwords (String). Hide each password as a star (*)
 * and show the hidden password
 Ex:
 Input:
 {"one", "hi", "hold}
 Output:
 [ ***, **, **** ]

 */

public class HidePassword {
    public static void main(String[] args) {

        // helper method: method that does some action, and its called somewhere

        String [] password = {"one", "apples", "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password) {
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("Original: " + Arrays.toString(password));
        System.out.println("Hidden: " + hiddenPassword);

    }

    public static String convertToStars (String str) {

        String stars = "";
        for (int i = 0; i < str.length(); i++) {
            stars += "*";

        }
        return stars;

    }
}
