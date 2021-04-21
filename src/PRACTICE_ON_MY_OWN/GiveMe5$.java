package PRACTICE_ON_MY_OWN;

import java.util.*; // SHORT CUT FOR IMPORT --> OPTION+ENTER

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter $ amount: ");
        int dollar = scan.nextInt();
        while(dollar != 5 ) {
            System.out.println("Give me $5");
            dollar = scan.nextInt();
        }
        System.out.println("Thank you for $5");
    }
}
