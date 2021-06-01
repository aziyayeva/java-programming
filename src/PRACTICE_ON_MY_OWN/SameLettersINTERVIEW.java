package PRACTICE_ON_MY_OWN;

import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

/**
 * Write a return method that check if a string is build out of the same letters as another string.
 * <p>
 * Ex:  same("abc",  "cab"); -> true
 * <p>
 * same("abc",  "abb"); -> false:
 */

public class SameLettersINTERVIEW {
    public static void main(String[] args) {
        boolean same1 = same("cat", "act");
        boolean same2 = same("cat", "Act");
        System.out.println(same1 + ":" + same2);

        boolean same3 = same("cat", "Act", true);
        System.out.println(same3);

        boolean b1 = same1("bcaacdbcd", "abcd");
        System.out.println("B1:" + b1);
        boolean b2 = same2("bcaacdbcd", "abcd");
        System.out.println("B2:" + b2);
    }

    public static boolean same(String str1, String str2) {
        return same(str1, str2, true);
    }

    public static boolean same(String str1, String str2, boolean ignoreCase) {
        if (ignoreCase) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
        }
        for (int i = 0; i < str1.length(); i++) {
            String checked = "" + str1.charAt(i);
            if (!str2.contains(checked)) {
                return false;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            String checked = "" + str2.charAt(i);
            if (!str1.contains(checked)) {
                return false;
            }
        }
        return true;
    }

    public static boolean same1(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "", a2 = "";
        for (char each : ch1)
            a1 += each;

        for (char each : ch2)
            a2 += each;

        return a1.equals(a2);
    }

    public static boolean same2(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);
    }
}
