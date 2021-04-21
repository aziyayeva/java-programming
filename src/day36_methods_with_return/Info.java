package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {

        System.out.println("Full Name: " + fullName());
        System.out.println("Married - " + isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("Birth Random year - " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + getRandomYear());
        System.out.println("DOB = " + getRandomYear());

        if(isMarried()) {
            System.out.println("married");
        } else {
            System.out.println("single");
        }


    }
    public static String fullName() {
        return "Anna Zi";
    }
    public static boolean isMarried () {
        return false;
    }
    public static int getAge () {
        return 35;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
