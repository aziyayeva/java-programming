package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Create a method called cube. It is a void method with no arguments.
 * Write all required code inside this method in order to read a number
 * from the console and then prints the cubed value of that number:
 *
 * Example:
 *
 * input: 5
 *
 * output: 125
 * input: 5
 *
 * output: 125
 * hint: cube of a number n = n^3 ->
 *
 * n * n * n
 */

public class CubeMethod {
    public static void main(String[] args) {

    }
    public static void cube(){
        Scanner scan = new Scanner (System.in);
        double num = scan.nextDouble();
        double cube = num*num*num;
        System.out.println(cube);
    }
}
