package day32_arrays_splits;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "java is fun"; // task is to reverse --> print fun id java
        String [] words = sentence.split(" "); // this makes each word to become a separate String.
        String reversed = "";

        for ( int i = words.length - 1; i >= 0; i--) {
           // System.out.println(words[1] + " ");
            reversed += words[i] + " ";
        }

        System.out.println("Sentence = " + sentence);
        System.out.println("Reversed = " + reversed);




    }
}
