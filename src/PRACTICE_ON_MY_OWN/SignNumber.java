package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.
 *
 * for example :
 *
 * sign(5)  => positive
 * sign(-30) => negative
 * sign(0)  => zero
 */

public class SignNumber {
    public static void main(String[] args) {

    }

    public static void sign (int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0 ) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
