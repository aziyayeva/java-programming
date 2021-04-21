package PRACTICE_ON_MY_OWN;

import java.util.Arrays;

/**
 * Given a String,reverse each individual word and print the resultHint:
 * Use a nested loop, split
 * Input: It started to snow in Chicago
 * Output:tI detrats ot wons ni ogacihC
 */

public class ReverseWordsArray {
    public static void main(String[] args) {

        String sentence = "It started to snow in Chicago";
        String[] words = sentence.split(" "); //          0      1     2     3   4     5
        //System.out.println(Arrays.toString(words)); // [It, started, to, snow, in, Chicago]
        String temp = "";
        for( String word : words) {
            for (int i = word.length() - 1; i >=0; i--) {
                temp += "" + word.charAt(i);

            }
            System.out.print(temp + " ");
            temp = "";

        }




    }
}
