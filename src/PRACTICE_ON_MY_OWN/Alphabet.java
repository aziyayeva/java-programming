package PRACTICE_ON_MY_OWN;

public class Alphabet {
    public static void main(String[] args) {
        char i;
        for(i = 0; i < 'z'; i++){
            System.out.print(i);

        }

        char letter = 'a';
        //System.out.println("letter = " + letter); // letter = a
        //letter++;
        //System.out.println("letter = " + letter); // letter = b

        while (letter <= 'z') {
            System.out.print(letter + " * ");
            letter++;

        }
        System.out.println(""); // next line
        System.out.println("Alphabet is finished ");


        // REVERSE ALPHABET
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " * ");
            letter--;

        }
        System.out.println("");
        System.out.println("Alphabet Reversed");


    }
}
