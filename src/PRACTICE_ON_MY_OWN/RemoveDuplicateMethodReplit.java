package PRACTICE_ON_MY_OWN;

/**
 * uniqueChars is a method that will accept any String and return the String with out any dupclicate characters
 *
 * Examples:
 * uniqueChars("java") ==> "jav"
 * uniqueChars("mama") ==> "ma"
 * uniqueChars("spoon") ==> "spon"
 */

public class RemoveDuplicateMethodReplit {
    public static void main(String[] args) {
        String word = "mohammad";
        System.out.println(nonDup(word));

    }
    public static String nonDup(String name) {

        String output = "";
        for ( int i = 0; i < name.length(); i++) {

            if(!output.contains("" + name.charAt(i))) { // you can also use this without ! -- but with continue;
                output += name.charAt(i); //
            }
        }
        return output;

    }
}
