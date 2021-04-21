package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(num % 2); // divisable by 2 the rest is the remainder(%)
        System.out.println(num % 2 == 0); /// either true OR false

        if (num % 2 == 0) {
            System.out.println(num + " is even");

        } else {
            System.out.println(num + " is odd");
        }
    }
}

