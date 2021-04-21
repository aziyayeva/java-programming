package day09_casting_scanner_practice;

import java.util.Scanner;

public class ScannerIntro {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
     //   System.out.println("Please ask a question");

      //  String firstName = scan.next();

      //  System.out.println("Nice to meet you, " + firstName);



                System.out.println("Enter number of milligrams in drink:");

                int numberOfmgs = scan.nextInt();
                int lethalDrinkCount = 10 * 1000 /scan.nextInt();

                System.out.println("It would take about " + lethalDrinkCount + " drinks for a lethal overdose. ");





    }
}
