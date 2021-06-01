package OfficeHours.Practice_04_21_2021;

/**
 * Complete the method isPalindrome() that will check if number is a palindrome.
 * Print your result as a boolean (true or false).
 * Challenge: Do not convert int into a string!
 * Examples:

 * input: 1001
 * output: true

 * input: 1234
 * output: false
 */

public class isPalindromeWithNumbers {
    public static void main(String[] args) {
       // System.out.println(112 % 1);
       // System.out.println(112 % 10);
       // System.out.println(112 % 100);
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number) {
      //  System.out.println(number % 10);
//        while (number != 0) {
//            System.out.println("number % 10: " + number % 10);
//            number /= 10;
//            System.out.println("number / 2: " + number );
//        }
  //      return false;

        int reverse = 0;
        int temp = number; // 121

        while(temp !=0) {

            int lastDigit = temp % 10; // 1
            reverse = lastDigit;
            System.out.println(reverse);
            temp /= 10;

        }
        return reverse == number;

    }

}


