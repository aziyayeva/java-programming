package day32_arrays_splits;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]); // java
        System.out.println("1st word = " + words[1]); // is
        System.out.println("1st word = " + words[2]); // fun
      //  System.out.println("1st word = " + words[3]); // out of bounds

        for(String w : words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] results = googleResult.split(" ");
        System.out.println(googleResult.split(" ")[1] );
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results [3].replace("(", "")); // getting rid of comma --> 0.68
        System.out.println("Seconds = " + results [3].substring(1)); // using substring --> 0.68


    }
}
