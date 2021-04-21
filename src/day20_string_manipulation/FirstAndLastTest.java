package day20_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char third = word.charAt(2);

        if(first == third) {
            System.out.println("first and third letter match");
        } else {
            System.out.println("first and third letters mismatched");
        }
        // OR WE CAN WRITE THIS LIKE THIS ONE.....

        if(word.charAt(0) == word.charAt(2)) {
            System.out.println("first and third letter match");
        } else {
            System.out.println("first and third letters mismatched");
        }

        String friend = "level";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() -1 );
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if(firstLetter == lastLetter) {
            System.out.println(friend + " - first and last match");

        } else {
            System.out.println(friend + " - first and last did not match");
        }



    }
}
