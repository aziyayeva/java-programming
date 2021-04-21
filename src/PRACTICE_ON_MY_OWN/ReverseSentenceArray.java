package PRACTICE_ON_MY_OWN;

/**
 * Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
 *
 * Example:
 * sentence -> Java is fun
 *
 * reversed > fun is Java
 */

public class ReverseSentenceArray {
    public static void main(String[] args) {

        String sentence = "Java is fun everyday";
        String [] array = sentence.split(" ");
        String temp = "";
        System.out.println(sentence);
        for(int i = 0; i < array.length/2; i++) { // division will flip the words last with first
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length -1 -i] = temp;
        }
        System.out.println(String.join(" ", array));




    }
}
