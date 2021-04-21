package OfficeHours.Practice_03_24_2021;

/**
 * Index
 *
 * java is
 * 0123456 // including space
 *
 * charAt(give the number) ===> gives you a character
 *
 * index(character = char)  ===> gives you a number(int) - (index ==> is the position of characters in string)
 *
 */

public class CharIndex {
    public static void main(String[] args) {

        String s = "java";
      //  System.out.println(s.charAt(s.length())); //please explain why length wont be possible?
        System.out.println(s.charAt(s.length() -1)); // always will be the last index

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println(s.charAt(0) + "" + s.charAt(2)); // understand concatanation vs addition ("")

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3); //JA
        System.out.println(upper);

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));


        System.out.println(s.indexOf('j') >= 0 ? "Contains" : "Not Contains"); /// terniary
        System.out.println(s.indexOf("g" )>= 0 ? "Contains" : "Not Contains"); // terniary

        System.out.println(s.contains("j"));




//s.toUpperCase().charAt(0) ----->> method chaining
        // string method cannot use Char




    }
}
