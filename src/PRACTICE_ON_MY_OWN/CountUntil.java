package PRACTICE_ON_MY_OWN;

import java.util.*;

public class CountUntil { // count from the number start to numberToStop
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to count unitl: ");

        int numberToStop = scan.nextInt(); // enter "3" and it will be assigned to the (numberToStop)
        int start = 1;

        while(start <= numberToStop) {
            System.out.print(start + " ");
            start++;
        }

    }
}
