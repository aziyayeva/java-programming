package PRACTICE_ON_MY_OWN;

import java.util.Arrays;

/**
 * The method person has a string arguement with this format:
 * "name,last name,age". Print out the person's information
 *
 * Example:
 *
 * person("jon,doe,30");
 *
 * output:
 * person name: jon
 * last name: doe
 * age: 30
 * person("jon,doe,30");
 *
 * output:
 * person name: jon
 * last name: doe
 * age: 30
 * hint: use the split method to split the string to a string array where there is a "," char
 */

public class PersonalInformationMethod {
    public static void main(String[] args) {

    }
    public static void person (String info) {
        String [] personalInformation = info.split(",");
        System.out.println("person name: " + personalInformation[0]);
        System.out.println("last name: " + personalInformation[1]);
        System.out.println("age: " + personalInformation[2]);

    }



















}
