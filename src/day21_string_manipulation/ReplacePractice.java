package day21_string_manipulation;

import java.sql.SQLOutput;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase()); // these are only temporary commands
        System.out.println(word.replace("hub", "lab"));  // these are only temporary commands
        System.out.println("word = " + word);
        
        // if you want to change the word you will need to reassign the word....
        
        word = word.replace("hub", "lab");
        System.out.println("word = " + word);;

        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);


        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
                result = result.replace("1-48 of over ", "")
                               .replace(",", "")
                               .replace(" results for java book", "");
                System.out.println("results " + result);

    }
}
