package OfficeHours.Practice_04_12_2021;

import java.util.Arrays;

/**
 * count how many
 */

public class ArrayEvenOdd {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 8, 2, 7, 10};

        int even = 0;
        int odd = 0;

        for (int eachNumber : numbers) {
            if (eachNumber % 2 == 0) {
                even++;
                // System.out.println("Even Number is: " + eachNumber);
            } else {
                odd++;
                //   System.out.println("My Odd number is: " + eachNumber);
            }
        }

        int[] evenNumber = new int[even];
        int[] oddNumber = new int[odd];

        /**
         *   i --> will keep track of the indexers in your numbers arrays
         *
         */
        for (int i = 0, e = 0, o = 0; i < numbers.length; i++, e++, o++) {

            if (numbers[i] % 2 == 0) {
                evenNumber[e++] = numbers[i];
            } else {
                oddNumber[o++] = numbers[i];


            }

        }

        System.out.println(Arrays.toString(evenNumber));
        System.out.println(Arrays.toString(oddNumber));

       // System.out.println("Even: " + even);
      //  System.out.println("Odd: " + odd);



    }
}
