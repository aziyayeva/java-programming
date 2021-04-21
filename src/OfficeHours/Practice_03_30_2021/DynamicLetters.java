package OfficeHours.Practice_03_30_2021;

import sun.lwawt.macosx.CInputMethod;

import java.util.*;

public class DynamicLetters {

    /**
     *
     * [Dynamic alphabet]
     * • Write a program that will ask ‘upper’ or ‘lower’
     * • If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
     * - Challenge: Also ask if they want to show the alphabet in ascending or order descending
     * - Ascending:A–Zora–z
     * - Descending:Z–Aorz–a
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("upper or lower");
        String upperOrLower = scan.next();
        int starting;
        int ending;

        if(upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';

        }



        for (int i = starting; i <= ending; i++) {
            System.out.print((char)i + " ");
        }

    }




}
