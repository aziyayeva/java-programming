package PRACTICE_ON_MY_OWN;

/**
 * Write a return method that can remove the duplicated values from String
 * <p>
 * Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

public class RemoveDupsINTERVIEW {
    public static void main(String[] args) {
        String result = removeDuplicates("AAABBBccdderaaAA");
        System.out.println(result);

    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = Character.toString(str.charAt(i));  //  you can use - "" + str.charAt(i)
            if (!result.contains(temp)) {
                result = result + temp;
            }
        }
        return result;
    }
}
