package PRACTICE_ON_MY_OWN;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Write a return method that can find the frequency of characters
 * <p>
 * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class FrequecyOfCharsINTERVIEW {
    public static void main(String[] args) {
        String result = frequencyOfChars("aaaAAAbabcdbddee");
        System.out.println(result);
    }

    public static String frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char original = str.charAt(i);
            if (!result.contains("" + original)) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    char compared = str.charAt(k);
                    if (original == compared) {
                        count++;
                    }
                }
                result = result + original + count;
            }
        }

        return result;
    }

}
