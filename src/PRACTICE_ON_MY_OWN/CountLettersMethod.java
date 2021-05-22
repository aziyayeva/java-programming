package PRACTICE_ON_MY_OWN;

/**
 * Write a method countLetters that can count letters in a given string and return a new string in the given format:

 * number of letters + letter
 * Example:
 * input: countLetters("aaabbcccc");
 *
 * output: "3a2b4c"
 */

public class CountLettersMethod {
    public static void main(String[] args) {

        String word = "aaabbcdd";
        String output = "";
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            count = 0;
            for (int j = 0; j < word.length(); j++) {

                if(word .charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            output += "" + count + word.charAt(i);

        }

    }
   // public static String countLetters (String characters) {


}
