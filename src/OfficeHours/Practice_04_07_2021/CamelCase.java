package OfficeHours.Practice_04_07_2021;

/**
 *
 * Camel Case
 * Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
 * Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
 Ex:

 * Input: thisHasManyWordsToFind
 * Output: 6
 *
 */

public class CamelCase {
    public static void main(String[] args) {

        String str = "thisHasManyWordsToFind";
        int words = 1; // starting word with lower already that's why we are starting with 1

        if(str.isEmpty()) {
            words = 0;
        }

        for (int i = 0; i < str.length(); i++) {

            // charAt will check all characters with the Upper Case.... if
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')  {
                words++;

            }
        }
        System.out.println("Words with upper case: " + words);

    }
}
