package Practice_With_Salam;

import java.util.Scanner;


/**
 * [Movie duration]
 *
 * The length of the movie will determine how much it costs.
 * Use a Scanner object to read the input from the user for how long the movie is and print
 * out how much the movie will cost.
 * The length will be given as a decimal as hours.minutes
 * > 1.0 - 8.99
 * > 1.5 - 10.50
 * > 2.0 - 12.99
 * > 2.5 - 14.50
 * -> 3 or more - 15.99
 */

public class MovieDuration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time;

        System.out.println("Enter the time of the movie? "); // we gave a prompt
        //now we need to read the input from the user

      //  double time = scan.nextDouble(); ---> declare and initialize variable from user input, if I did not declare
      // time and price in line 23 and 24, this is the way to initialize variables......RECOMMENDED THIS WAY....

      time = scan.nextDouble(); //initialized the variable.

        if (time > 3) {
            System.out.println("The price is $15.99");
        } else if (time > 2.5) {
            System.out.println("The price is $14.50");
        } else if (time > 2.0) {
            System.out.println("The price is $12.99");
        } else if (time > 1.5) {
            System.out.println("The price is $10.50");
        } else if (time > 1.0) {
            System.out.println("The price is $8.99");
        }






    }

}
