package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

// IT IS RECOMMENDED TO ALWAYS USE {}

        if(todaysClass.equals ("java"))       /// boolean condition.....string
            System.out.println("java is fun"); // sometimes you can skip {} when you have only 1 - statement...
        else
            System.out.println("it is not java. it is " + todaysClass);
    }
}
