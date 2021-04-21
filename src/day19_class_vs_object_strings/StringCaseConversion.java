package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyBerTer";
        String sentence = "Java is fun!";

        System.out.println(word.toUpperCase());
        // CONVERT WORD TO ALL LOWERCASE
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toUpperCase());

    }
}
