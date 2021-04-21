package PRACTICE_ON_MY_OWN;
import java.util.*;

/**
 * Implement the plus method. The return is void and has no arguments.
 *
 * The method should ask the user to input two numbers, then it will add them and print the result.
 *
 * Hint: Create a scanner within plus method.
 *
 * Example:
 *
 * enter first number:
 * 1
 * enter second number:
 * 2
 * result: 3
 */

public class SimpleCalculatorMethods {
    public static void main(String[] args) {

    }
    public static void plus(){
        Scanner scan = new Scanner (System.in);
        System.out.println("enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("enter the first number:");
        int num2 = scan.nextInt();
        System.out.println("enter the second number:");

        int sum = num1 + num2;
        System.out.println("results = " + sum);
    }
}
