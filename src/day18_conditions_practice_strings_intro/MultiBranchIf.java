package day18_conditions_practice_strings_intro;

/**
 *
 * number => 5
 *
 * number is more than 0
 *     print 5 is positive
 * number is less than 0
 *     print number is negative
 * number equal 0:
 *     print number is zero
 */

//HARD CODING
    //MULTI BRANCH
public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number +  " is zero");
       // } else if(0 == 0) {                              ------ COMPUTER WILL WORK HARDER THIS WAY.....
        //    System.out.println("number is " + number);          SHOULD JUST USE } ELSE {
        }
    }
}
