package day24_loops;

public class Alphabet {
    public static void main(String[] args) {

        char letter = 'a';
        //  System.out.println("letter = " + letter);
        //  letter++;
        //  System.out.println("letter = " + letter);

        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }

        System.out.println("");
        System.out.println("Alphabet has been finished");

        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;


        }
    }
}
