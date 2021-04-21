package OfficeHours.Practice_03_30_2021;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Enumeration;
import java.util.Scanner;

public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number > max) {
                max = number;
            }

            System.out.println(max);
        }


            // THIS BELOW IS WHAT IT LOOKS LIKE WHEN LOOP HAPPENS.....
            // INSTEAD OF TYPING SO MUCH YOU USE LOOP ABOVE THIS

     //   int numOne = scan.nextInt();
    //    int numTwo = scan.nextInt();
     //   int numThree = scan.nextInt();

    //    int max = 0;

     //   if(numOne > max) {
       //     max = numOne;
        }
     //   if(numTwo > max) {
    //        max = numTwo;
        }




