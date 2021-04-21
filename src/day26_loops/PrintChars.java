package day26_loops;

public class PrintChars {
    public static void main(String[] args) {


        String word = "Murodil";

        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + " - " + word.charAt(i) + " ");
        }

        System.out.println("");


//      REVERSE......
        String word1 = "Murodil";

        for (int i = word.length()-1; i >= 0; i--) {
            System.out.println(i + " - " + word.charAt(i) + " ");
        }





/**    //OR YOU CAN USE LOOP INSTEAD OF TYPING SO MANY LINES
 *
 *      String word = "java";
 *
 *      System.out.println(word.length());
 *
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));  ----- ERROR
 */





    }
}
