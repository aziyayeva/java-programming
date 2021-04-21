package PRACTICE_ON_MY_OWN;

import java.util.Random;



public class RandomNumber {
    public static void main(String[] args) {
        /**
         CHALLENGE – THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
         Generate a random number that is six digits long. Each digit in this number should be unique,
         meaning the number 6 digit number should have 6 different character numbers that make it up.
         Print the number.
         HINTS: Loops, Strings, Random


         Random ran = new Random();
         String number = "";
         int num, count = 0;
         for (int i = 1; i <= 6; i++){
         do {
         num = ran.nextInt(9);
         count++;
         if (!number.contains(num+"")){
         number += num;
         }
         }
         while (number.length() != i);
         }
         System.out.println(number);
         System.out.println("count = " + count);
         }
         }


         */

                Random randomNum = new Random();
                String randomNumber = ""; // this is empty because we will be collecting random number and adding to
                                          // them to this String

            while(randomNumber.length() != 12) {
                int num = randomNum.nextInt(10); // to make it unique characters we can generate only from 0-9
                  //if the String does not contain any number than add that number to a String
                if( ! randomNumber.contains(num + "")) {   //(num + "") b/c we converting the number to a String
                    randomNumber = randomNumber + num + " ";
                }
            }
        System.out.println("Random Number " + " " + randomNumber);


    }
}

