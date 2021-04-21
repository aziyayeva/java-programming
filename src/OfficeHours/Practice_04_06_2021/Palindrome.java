package OfficeHours.Practice_04_06_2021;

public class Palindrome {
    public static void main(String[] args) {

        String word = "civic";
        boolean isPalindrome = true;

        //Q: what is your String has a million characters?

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1-i)) {  // -1 because we are checking the last letter is it 'a' or not....
                isPalindrome = false;                                  // n!= n
                break;                                                 //checks characters in the beginning and at the end...

            }

        }
        System.out.println(isPalindrome);
    }
}
