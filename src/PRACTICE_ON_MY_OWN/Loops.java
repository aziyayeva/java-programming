package PRACTICE_ON_MY_OWN;

/**
 * LOOP:
 * [IQ] Duplicate characters
 * Given a String, find and print the duplicate characters.
 * A character is duplicate if it appears more than once in the String.
 * Ex: AAABCCDEEF
 * Output:  ACE
 */

public class Loops {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String dup = "";

        for(int i = 0; i < str.length(); i++ ) {
            int count = 0;
            if(dup.contains("" + str.charAt(i)) ){
                continue;
            }
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) ) {
                    count++;

                }
            }
            if (count > 1) {
                System.out.println("Is Duplicate - " + str.charAt(i));
            }
            dup+=str.charAt(i);
        }

    }
}
