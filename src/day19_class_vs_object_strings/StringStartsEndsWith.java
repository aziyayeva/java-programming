package day19_class_vs_object_strings;

import java.sql.SQLOutput;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.startsWith("a"));
        System.out.println(word.startsWith("jav"));
        System.out.println(word.startsWith("va"));
        System.out.println("Anna".startsWith("A"));

        System.out.println(word.endsWith("a"));

        /// NEW EXAMPLE

        String firstName = "M. Anna";

        if(firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else {
            System.out.println("You name is wonderful " + firstName);
        }

        /**
         * String url = "https://www.wwwew.com"
         * .com = "commercial"
         * .ru = "russian"
         */

        String url = "www.trump.gov";

        if (url.endsWith(".gov")) {
            System.out.println("GOVERNMENT");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian");
        } else {
            System.out.println("I am not interested in " + url);
        }

    }
}
