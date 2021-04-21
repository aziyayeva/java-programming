package OfficeHours.Practice_03_31_2021;

public class CountUpperLowerOrNumber {

    /**
     * Count upper, lower, and numbers
     * Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
     * Ex:
     * Input: 2juMp41EEkd4s4 Output:
     * 3 uppercase letters
     * 6 lowercase letters
     * 5 numbers
     */

    public static void main(String[] args) {

        String word = "254mhtr58HRtpeJN";
        int upperCase = 0, lowerCase = 0, number = 0;

        for(int i = 0; i < word.length(); i++) {

            char eachLetter = word.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;

            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;

            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }
            }
        System.out.println("Uppercase: " + upperCase); // WE ARE USING THE PRINT OUTSIDE OF THE LOOPS NOT TO SEE
        System.out.println("Lowercase: " + lowerCase); //PRINT TO PRINT MULTIPLE TIME JUST LIKE A LOOP...
        System.out.println("Number: " + number);

    }
}
