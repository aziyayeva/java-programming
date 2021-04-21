package day20_string_manipulation;

import java.sql.SQLOutput;

public class StringContains {
    public static void main(String[] args) {

        String company = "Capital One";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); // true
        System.out.println(company.contains("l O")); // true


        //if company contains space, print "company name with multiple words"
        //else "single word company"

        if(company.contains(" ")) {
            System.out.println("company name with multiple words");
        } else {
            System.out.println("single word company");
        }

        String etsyTitle = "Wooden spoon | etsy";

        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        String firstName = "ahmed";
        //check is firstNAme "a" and "e" at the same time.

        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("super");
        } else {
            System.out.println(" you are not cool");
        }

        firstName = "Nadir";

        if(firstName.contains("a") || firstName.contains("i")) {
            System.out.println("awesome");
        } else {
            System.out.println("ehhh");
        }

        String email = "aNa123@gmail.com";

        if(email.contains("@") && email.contains(".com")) {
            System.out.println("correct");
        } else {
            System.out.println("failed email");
        }

        if(email.toUpperCase().contains("N")) {
            System.out.println("n is present");

        } else {
            System.out.println("n is not present");
        }



    }
}
