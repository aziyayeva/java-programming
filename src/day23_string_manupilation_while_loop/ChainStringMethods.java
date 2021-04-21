package day23_string_manupilation_while_loop;

public class ChainStringMethods {
    public static void main(String[] args) {

        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ", "").toUpperCase() );

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));

    }
}
