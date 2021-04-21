package day38_methods;
import static day38_methods.StringUtils.*;

public class StringUtils {

    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

        System.out.println("Is Palindrome (Cybertek) = " + isPalindrome("Cybertek"));

        String word1 = "sunday";
        String revWord = StringUtils.reverse(word1);
        System.out.println("word1 = " + word1);
        System.out.println("reverse() = " + revWord);
        System.out.println(StringUtils.reverse("java"));

    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//        return false;
    }

   public static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
   }
    public static String reverse (String str) {

        String reverseString = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    }


