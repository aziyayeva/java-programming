package day09_casting_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents = 123;
        int dollars = cents / 1;
        int remainderCents = cents % 100;

        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainderCents);


    }
}
