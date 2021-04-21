package PRACTICE_ON_MY_OWN;

import java.util.*;

public class MinMaxLoops {

    /**
     *
     * Write a program that can ask the user "enter a number" five times and return the maximum number•


     *Write a program that can ask the user "enter a number" five times and return the minimum number
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int max = num;
        int min = num;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter number: " );
            int number = scan.nextInt();

            if(number > max){
                max = number; //not equal, we assign "max" to a "number"
            }
            if (number < min) {
                min = number; //not equal, we assign "min" to a "number"
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}



