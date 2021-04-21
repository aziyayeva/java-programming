package day20_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
       // System.out.println(word.charAt(4));
        System.out.println(word + "-" + word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));

        char firstLetter = company.charAt(0); // ALWAYS GIVE THE POSITION IN NUMBERS
        char secondLetter = company.charAt(1);
        char thirstLetter = company.charAt(2);
        char forthLetter = company.charAt(3);
        char fifthLetter = company.charAt(4);
        char sixthLetter = company.charAt(5);
        char seventhLetter = company.charAt(6);
        char eighthLetter = company.charAt(7);

        System.out.println("The word = " + firstLetter + " " + secondLetter + " " + thirstLetter + " " +
                forthLetter + " " + fifthLetter + " " + sixthLetter + " " + seventhLetter + " " + eighthLetter);

        String withSpaces = (firstLetter + " " + secondLetter + " " + thirstLetter + " " +
                forthLetter + " " + fifthLetter + " " + sixthLetter + " " + seventhLetter + " " + eighthLetter);
        System.out.println("withSpaces = " + withSpaces);

    }
}
